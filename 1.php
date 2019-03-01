<!DOCTYPE HTML>  
<html>
<head>
<link  rel="stylesheet" type="text/css" media="screen" ref="/Desktop/web/try/styles.css"/>
</head>
<body>


<?php

$nameErr=$emailErr=$websiteErr=$commentErr="";
$name = $email = $gender = $comment = $website = "";
echo "hi";
if ($_SERVER["REQUEST_METHOD"] == "POST")
{
	echo "inside";
	$name=$_POST["name"];
	$email=$_POST["email"];
	$website=$_POST["website"];
	$comment=$_POST["comment"];
	$gender=$_POST["gender"];
	$status=$_POST["status"];
	
	if(empty($name))
		$nameErr="* Name is required";

	if(empty($email))
		$emailErr="* email is required";
	else
	{
		if(!filter_var($email,FILTER_VALIDATE_EMAIL))
			$emailErr="* Invalid";
	}	

	if(empty($website))
		$websiteErr="* website is required";
	else
	{
		if(!preg_match("/\b((https?|ftp):\/\/www\.)[-a-zA-Z0-9#@%&?$*~=+_\/|!.:,;]*[-a-zA-Z0-9#@%?&$*~=+_\/|]/",$website))
			$websiteErr="* Invalid";
	}		

	if(empty($comment))
		$commentErr="* comment is required";
		
	
	$servername="localhost";
	$username="root";
	$password="manaswini";
	
	$conn = new mysqli($servername,$username,$password);
	if($conn->connect_error)
	{
		echo "problem";
	}
	
	echo "connected";
	
	$sql="use manas";
	
	if($conn->query($sql)==TRUE)
		echo "done"; 
	
	
	$sql="insert into info values('{$name}','{$email}','{$website}','{$comment}','{$gender}','{$status}')";
	
	if($conn->query($sql)==TRUE)
		echo "done"; 
		
	
}


?>

 	
<!--<form method="POST" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">    -->

<form method="POST" action="1.php">

Name    : <input type="text" name="name"> 

<span class="error">
<?php
echo $nameErr;
?>
</span>
<br>

E-mail 	: <input type="text" name="email">
<span class="error">
<?php
echo $emailErr;
?>
</span><br>

Website : <input type="text" name="website" required>
<span class="error">
<?php
echo $websiteErr;
?>
</span><br>

Comment : <textarea type="text" rows="5" cols="40" name="comment"></textarea><br>
<br><br>
Gender 	:
<input type="radio" name="gender" value="Female">F
<input type="radio" name="gender" value="Male">M
<input type="radio" name="gender" value="Other">Other
<br><br>

Status	:
<input type="checkbox" name="status" value="Working">Working
<input type="checkbox" name="status" value="Studying">Studying
<input type="checkbox" name="status" value="Mind your work">Mind your work
<br><br>
<input type="submit" name="submit" value="submit" >
</form>


<?php

echo "$name<br>$email<br>$website<br>$comment<br>$gender<br>$status<br>" ;

$sql="select * from info";
		
	$result= $conn->query($sql);
	
	if($result->num_rows > 0)
	{
		echo "NAME      EMAIL<br>";
		while($row=$result->fetch_assoc())
		{
			//echo "hey\n";
			echo $row["name"]."\t\t\t\t\t\t\t".$row["email"]."<br>";
		}
	}
	
	$conn->close();
	
?>

</body>
</html>

