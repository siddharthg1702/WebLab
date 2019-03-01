import mysql.connector
from flask import Flask, request

app = Flask(__name__,static_url_path = "")

@app.route('/result/<string:x>&<string:y>', methods = ['GET'])
def result(x,y):
    try:
        db = mysql.connector.connect(host="localhost",user="root",password="Sid_12345",database="test")
        print(db)
        cursor = db.cursor()
        
        sql = "use test;"
	cursor.execute(sql)
	
        sql = "SELECT * from tab where id ='"+x+"' and password='"+y+"';"
        print(sql)
        # return "S"
        cursor.execute(sql)
        result = cursor.fetchall()
        print(result)
        if len(result) == 0:
            return "Please Verify Credentials"
        ans = ""
        for a in result:
            print('hi',a)
            for b in range(0,len(a)):
            	print('checking')
                ans=ans+"#"+str(a[b])	
        
	print('hello',ans)
        # return "S"
        return ans
        
    except mysql.connector.Error as e:
        print(e)
    

if __name__ == '__main__':
	app.run(host='127.0.0.1',port=3000,debug = True)