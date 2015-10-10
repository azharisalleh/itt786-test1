<?php
//Created by azhari hj salleh
//ID 2014461166
//This program for write content to azhari.bin

/*     Name:
       Matrix No:
       Gender:
       Age:
       E-mails:
       Mobile Phone:
*/

$h=fopen("azhari.bin", 'w+');

if(fwrite($h,'Name : Azhari Hj Salleh'."\n") == false)
echo 'Error Writing';

if(fwrite($h,'Matrix No : 2014461166'."\n") == false)
echo 'Error Writing';

if(fwrite($h,'Gender : Male'."\n") == false)
echo 'Error Writing';

if(fwrite($h,'Age : 40'."\n") == false)
echo 'Error Writing';

if(fwrite($h,'Email : azhari.salleh@gmail.com'."\n") == false)
echo 'Error Writing';

if(fwrite($h,'Mobile No : 013 66666666'."\n") == false)
echo 'Error Writing';

fclose($h);
echo 'Written Done.';


?>