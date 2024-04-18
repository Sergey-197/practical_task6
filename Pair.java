package Task6;
class Pair<T, U> {
    private T name;
    private U age;
    private String text;

    public Pair(T name, U age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getAge() {
        return age;
    }

    public void setAge(U age) {
        this.age = age;
    }
}