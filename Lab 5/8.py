import mysql.connector
from flask import Flask, request

app = Flask(__name__,static_url_path = "")

@app.route('/result/<string:x>&<string:y>', methods = ['GET'])
def result(x,y):
    try:
        db = mysql.connector.connect(host="localhost",user="root",password="Sid_12345", database="test")
        print(db)
        cursor = db.cursor()

        sql = "SELECT * from student where RegNo ='"+x+"' and Password='"+y+"';"
        print(sql)

        cursor.execute(sql)
        result = cursor.fetchall()
        print(result)
        if len(result) == 0:
            return "Please Verify Credentials"
        
        ans = ""
        for a in result:
            for b in range(0,len(a)):
                ans=ans+"#"+str(a[b])
        
        return ans        

    except Exception as e:
        print('Exception caught', e)

if __name__ == '__main__':
	app.run(host='127.0.0.1',port=5555,debug = True)
