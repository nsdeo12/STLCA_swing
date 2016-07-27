On Error Resume Next
Set objExcel=CreateObject("Excel.Application")
objExcel.Application.Run "'M:\templates\idcpsHeader.xlsm'!Workbook_Open"
objExcel.Application.Run "'M:\templates\processing.xlsm'!Workbook_Open"
objExcel.Application.Run "'M:\templates\Xls2Csv.xlsm'!Workbook_Open"

objExcel.DisplayAlerts=False
objExcel.Application.Quit
Set objExcel=Nothing
On Error Resume Next

WScript.Quit 1