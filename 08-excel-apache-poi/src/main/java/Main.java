import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        readExcelFile("laborator8_input.xlsx");
        System.out.println();
        writeExcelFile("workbook.xlsx");
    }

    public static void readExcelFile(String filePath) {
        try (FileInputStream file = new FileInputStream(new File(filePath));
             XSSFWorkbook workbook = new XSSFWorkbook(file)) {

            XSSFSheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    if (cell.getCellType() == CellType.NUMERIC) {
                        System.out.print(cell.getNumericCellValue() + "\t");
                    } else if (cell.getCellType() == CellType.STRING) {
                        System.out.print(cell.getStringCellValue() + "\t");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeExcelFile(String filePath) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Employee Data");
        XSSFCellStyle greenCellStyle = workbook.createCellStyle();
        greenCellStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        greenCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        Map<String, Object[]> data = new TreeMap<>();
        data.put("1", new Object[]{"NAME", "LASTNAME","GRADE1","GRADE2","GRADE3","GRADE4"});
        data.put("2", new Object[] {"Amit", "Shukla", 9,8,7,5});
        data.put("3", new Object[] {"Lokesh", "Gupta", 8,9,6,7});
        data.put("4", new Object[] {"John", "Adwards", 8,8,7,6 });
        data.put("5", new Object[] {"Brian", "Schultz", 7,6,8,9});

        int rownum = 0;
        for (String key : data.keySet()) {
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                cell.setCellStyle(greenCellStyle);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
            }
        }

        try (FileOutputStream out = new FileOutputStream(new File(filePath))) {
            workbook.write(out);
            System.out.println(filePath + " written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
