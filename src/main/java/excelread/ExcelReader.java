package excelread;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) {
        try {
            // Specify the path to the Excel file
        	 String excelFilePath = "path/to/your/excel/file.xlsx";

            // Create a FileInputStream to read the Excel file
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

            // Create a workbook object, based on the Excel file
            Workbook workbook = new XSSFWorkbook(inputStream);

            // Get the first sheet from the workbook
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate through each row of the sheet
            for (Row row : sheet) {
                // Iterate through each cell in the row
                for (Cell cell : row) {
                    // Print the cell value
                    System.out.print(cell + "\t");
                }
                System.out.println(); // Move to the next line for the next row
            }

            // Close the workbook and input stream
            workbook.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

