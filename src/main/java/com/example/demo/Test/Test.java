package com.example.demo.Test;

class  Data {
    String name;

    public Data(String n) { //생성자 오버로딩이 있으면 습관적으로 기본생성자를 넣어야한다.
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Test {

        public void main(String[] args) {
            Data data = new Data(""); //()는 안돌아감, 자동완성 기능있어서 써야함
            System.out.println(data.name);
        }
    }
}
