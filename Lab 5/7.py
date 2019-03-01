from flask import Flask

app = Flask(__name__,static_url_path = "")


@app.route('/add/<int:x>&<int:y>', methods = ['GET'])
def add(x,y):
	print("result:",str(x+y))
	return str(x+y)

@app.route('/sub/<int:x>&<int:y>', methods = ['GET'])
def sub(x,y):
	print("result:",str(x-y))
	return str(x-y)

@app.route('/mul/<int:x>&<int:y>', methods = ['GET'])
def mul(x,y):
	print("result:",str(x*y))
	return str(x*y)

@app.route('/div/<int:x>&<int:y>', methods = ['GET'])
def div(x,y):
	if y == 0:
		return 'Divide by Zero not permitted'
	print("result:",str(x/y))
	return str(x/y)

if __name__ == '__main__':
	app.run(host='localhost',debug = True)
