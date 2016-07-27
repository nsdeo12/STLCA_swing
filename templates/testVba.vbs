On Error Resume Next
Set objExcel=CreateObject("Excel.Application")
objExcel.Application.Run "'M:\templates\macroAgrtr.xlsm'!Sheet1.textR"
objExcel.DisplayAlerts=False
objExcel.Application.Quit
Set objExcel=Nothing
On Error Resume Next
msgbox 'complete'
