const express = require('express');
const cors = require('cors');

const app = express();


app.use(cors());
app.use(express.json());
var mysql = require('mysql');

app.post('/signup', (req, res) => {
    const { userName, password } = req.body
        con.connect(function(err) {
    const sql_2 = " INSERT INTO users (user_name, password) VALUES (?)";
    const sql_1 = "select user_name from users where user_name = ?"
    let value2 = [userName,password]
    let value1 = [userName]


    console.log(err)
    con.query(sql_1,[value1], function (err, result) {
       if(result.length === 0){
        res.send({
            userName : userName,
            password : password,
            statusMessage : 'Signup successful'
          })
        con.query(sql_2,[value2], function (err, result) {
            if (err) throw err;
            console.log('sfkjbgfkjgb   ', result)
          });
    if (err) throw err;
       }
       else {
        res.send('User existed or rename the username')
       }
      });
  });
 ;


});

app.post('/signin',(req,res)=>{
  const { userName, password } = req.body
  const sql = 'SELECT * FROM users WHERE user_name = ?'
  const value = [userName]
  con.connect(function(err) {

    con.query(sql,[value], function (err, result) {
       if(result[0]?.user_name === userName && result[0]?.password === password ){
    console.log(result)
    if (err) throw err;
    res.send({
      userName : userName,
      password : password,
      statusMessage : 'Signup successful'
    })
       }
       else {
        res.send('Invalid credentials or user is not existed')
       }
      });
  });
 })
var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "password",
    database: "j_news",
    multipleStatements: true
  });
  
app.get('/Authentication', (req, res) => {
    res.json({ message: "Hello from server!" });
});

app.listen(8000, () => {
    console.log(`Server is running on port 8000.`);
  });