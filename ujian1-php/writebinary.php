<?php
//Created by azhari hj salleh
//ID 2014461166
//This program for write content to azhari.txt

/*     Name:
       Matrix No:
       Gender:
       Age:
       E-mails:
       Mobile Phone:
*/

$fp = fopen("binary-azhari.dat", "wb");
for ($i = 0; $i < 256; $i++) {
    // Assign a binary byte to a variable
    $data = pack("C*",$i);
 
    // Write the byte to the file
    fwrite($fp, $data);
}
fclose($fp);


?>