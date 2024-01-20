<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #dc143c;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049 ;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<body>

<center><h1 style="color:#dc143c;">Add student</h1></center>
<hr>
<div>
  <form action="adminpagedata" method="post">
    <label for="rid">Result ID</label>
    <input type="text" id="fname" name="rid" placeholder="enter result id" required>

    <label for="m1">subject BCA101</label>
    <input type="text" id="lname" name="sub1" placeholder="enter marks in digit" required>

     <label for="m2">subject BCA102</label>
    <input type="text" id="lname" name="sub2" placeholder="enter marks in digit" required>
    <label for="m3">subject BCA103</label>
    <input type="text" id="lname" name="sub3" placeholder="enter marks in digit" required>
    <label for="m4">subject BCA104</label>
    <input type="text" id="lname" name="sub4" placeholder="enter marks in digit" required>
    <label for="m5">subject BCA105</label>
    <input type="text" id="lname" name="sub5" placeholder="enter marks in digit" required>
    
  
  <label for="sid">Enter student Id<label>
    <input type="text" id="lname" name="sid" placeholder="enter sid">
    <input type="submit" value="Submit">
  </form>
</div>

</body>
</html>


    