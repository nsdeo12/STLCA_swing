On Error Resume Next
Set objExcel=CreateObject("Excel.Application")
objExcel.Application.Run "'M:\templates\durationMacro.xlsm'!Workbook_Open"
objExcel.DisplayAlerts=False
objExcel.Application.Quit
Set objExcel=Nothing
On Error Resume Next

WScript.Quit 1