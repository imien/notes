将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式。
Android中的AlertDialog使用的是建造者模式，另外，很多第三方框架如Glide、Okhttp等都使用了建造者模式。

public class Person {
    private String name;
    private String sex;
    
    private Person(Builder builder) {
        this.name = builder.name;
        this.sex = builder.sex;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getSex() {return sex;}
    public void setSex(String sex) {this.sex = sex;}
    
    public static class Builder {
        private String name;
        private String sex;
        
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setSex(String sex){
            this.sex = sex;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
