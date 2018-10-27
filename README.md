# ratpack-flatleftright-example
[![Build Status](https://travis-ci.org/gregwhitaker/ratpack-flatleftright-example.svg?branch=master)](https://travis-ci.org/gregwhitaker/ratpack-flatleftright-example)

An example of using `flatLeft` and `flatRight` in [Ratpack](https://www.ratpack.io).

The `flatLeft` and `flatRight` commands add values to the returned `Pair` just like the `left` and `right` commands. However,
unlike left and right, flatLeft and flatRight add the resolved value of the Promise to the Pair and not the Promise itself.

## Building the Example
Run the following Gradle command to build the example:

    ./gradlew clean build
    
## Running the Example
1. Run the following Gradle command to start the example:

        ./gradlew run
    
2. Execute the following command to retrieve the employee widget report:

        curl http://localhost:5050/api/v1/reports/employees/1/widgets
        
    If sucessful you will see the following response:
        
        {"employeeId":1,"firstName":"John","lastName":"Smith","inspectedWidgets":[{"widgetId":2,"inspectionDate":"2018-10-27 10:38:35"},{"widgetId":22,"inspectionDate":"2018-10-27 10:38:35"},{"widgetId":36,"inspectionDate":"2018-10-27 10:38:35"},{"widgetId":37,"inspectionDate":"2018-10-27 10:38:35"},{"widgetId":38,"inspectionDate":"2018-10-27 10:38:35"},{"widgetId":39,"inspectionDate":"2018-10-27 10:38:35"},{"widgetId":42,"inspectionDate":"2018-10-27 10:38:35"},{"widgetId":46,"inspectionDate":"2018-10-27 10:38:35"},{"widgetId":49,"inspectionDate":"2018-10-27 10:38:35"},{"widgetId":62,"inspectionDate":"2018-10-27 10:38:35"},{"widgetId":72,"inspectionDate":"2018-10-27 10:38:35"}]}
    
## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/ratpack-leftright-example/issues).

## License
MIT License

Copyright (c) 2018 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.