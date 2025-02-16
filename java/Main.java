import java.io.*;
import java.nio.file.attribute.*;
import java.util.*;
import java.util.zip.*;

public class Main {

	static
	public void main(String[] args) throws Exception {
		File inputTextFile = new File("../zip/test.txt");
		File outputZipFile = new File(args[0]);

		try(OutputStream os = new FileOutputStream(outputZipFile)){
			ZipOutputStream zipOs = new ZipOutputStream(os);

			// The UNIX epoch time
			FileTime fileTime = FileTime.fromMillis(0);

			int[] levels = {1, 3, 5, 7, 9};
			for(int level : levels){
				String name = inputTextFile.getName();
				name = name.replace(".", ("-" + String.valueOf(level) + "."));

				ZipEntry zipEntry = new ZipEntry(name);
				zipEntry.setLastModifiedTime​(fileTime);

				zipOs.setLevel(level);
				zipOs.putNextEntry(zipEntry);
				compress(inputTextFile, zipOs);
				zipOs.closeEntry();
			}

			zipOs.close();
		}

		try(ZipFile zipFile = new ZipFile(outputZipFile)){
			
			for(Enumeration<? extends ZipEntry> zipEntries = zipFile.entries(); zipEntries.hasMoreElements(); ){
				ZipEntry zipEntry = zipEntries.nextElement();

				System.out.println(zipEntry.getName() + "\t" + zipEntry.getMethod() + "\t" + zipEntry.getCompressedSize());
			}
		}
	}

	static
	private void compress(File inputFile, OutputStream os) throws Exception {

		try(InputStream is = new FileInputStream(inputFile)){
			byte[] buffer = new byte[1024];

			while(true){
				int length = is.read(buffer);
				if(length < 0){
					break;
				}

				os.write(buffer, 0, length);
			}

			os.flush();
		}
	}
}