On Error Resume Next

Dim WshShell
Dim strCurDir
strCurDir=WShell.CurrentDirectory

Set WshShell = WScript.CreateObject("WScript.Shell")
WScript.Echo WshShell.CurrentDirectory


strFile = Dir(strPath & "\*.xlsm")
MsgBox strFile &'\macroAgrtr.xlsm'!Sheet1.textR
Set objExcel=CreateObject("Excel.Application")
objExcel.Application.Run "strFile &'\macroAgrtr.xlsm'!Sheet1.textR"

objExcel.DisplayAlerts=False
objExcel.Application.Quit
Set objExcel=Nothing
On Error Resume Next

WScript.Quit 1


