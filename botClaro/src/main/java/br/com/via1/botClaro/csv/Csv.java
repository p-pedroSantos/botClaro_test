package br.com.via1.botClaro.csv;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.springframework.web.servlet.view.document.AbstractXlsView;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class Csv {

	public void lerarquivo() throws IOException {
		Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\pedro.silva\\Downloads\\PONTOS DE CONTA CLARO.xlsx"));
		//Workbook workbook =
	            XSSFWorkbook workbook = new XSSFWorkbook(file);

		
		
		//CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(0).build();
		//List<String[]> arquivo = csvReader.readAll();		
		//System.out.println(parser.getHeaderNames());
		//System.out.println(arquivo.size());
		
	}
}
