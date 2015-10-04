<?php
//Created by azhari hj salleh
//ID 2014461166
//This program for read azhari.txt content to screen

/*     Name:
       Matrix No:
       Gender:
       Age:
       E-mails:
       Mobile Phone:
*/
$fp = fopen("binary-data.dat","rb");
while (!feof($fp)) {
    // Read the file, in chunks of 16 byte
    $data = fread($fp,16);
    $arr = unpack("C*",$data);
    foreach ($arr as $key => $value) {
        echo " " . $value;
    }
    echo "\n";
}

?>