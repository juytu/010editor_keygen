from flask import Flask
app = Flask(__name__)

@app.route('/cgibin/010editor_check_license_9b.php')
def hello_world():
    print("GET /cgibin/010editor_check_license_9b.php")
    return '<ss>valid</ss> \n\n'

if __name__ == '__main__':
   app.run(host='0.0.0.0', port=80)