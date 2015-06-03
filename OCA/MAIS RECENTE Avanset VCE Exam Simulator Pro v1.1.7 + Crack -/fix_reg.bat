@Echo off 
REG ADD HKCR\.VCE /ve /t REG_SZ /d "VCEFile" /f
REG ADD HKCR\VCEFile /ve /t REG_SZ /d "Visual CertExam Suite File" /f
REG ADD HKCR\VCEFile\DefaultIcon /ve /t REG_SZ /d "%CD%\designer.exe,1" /f
REG ADD HKCR\VCEFile\Shell\Open\Command /ve /t REG_SZ /d "%CD%\designer.exe %%1" /f
