<?php
$handle = fopen('azhari.bin','r+');
while(!feof($handle))
{
echo str_replace("\n","<br />",fgets($handle));
}

?>