package Lab1;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {

    public static String[][] readExcelByColumns(String filePath, int sheetIndex) throws IOException {
        FileInputStream file = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(sheetIndex);

        List<List<String>> dataWithoutGaps = new ArrayList<>();

        for (Row row : sheet) {
            List<String> rowData = new ArrayList<>();
            for (Cell cell : row) {
                if (cell != null) {
                    switch (cell.getCellType()) {
                        case STRING:
                            rowData.add(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            rowData.add(String.valueOf((int) cell.getNumericCellValue()));
                            break;
                        default:
                            rowData.add(""); 
                            break;
                    }
                } else {
                    rowData.add(""); 
                }
            }
            dataWithoutGaps.add(rowData);
        }

        workbook.close();
        file.close();

        String[][] processedData = new String[dataWithoutGaps.size()][];
        for (int i = 0; i < dataWithoutGaps.size(); i++) {
            List<String> rowData = dataWithoutGaps.get(i);
            processedData[i] = rowData.toArray(new String[0]);
        }

        return processedData;
    }
}
