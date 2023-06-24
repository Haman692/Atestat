public class toys {


    public int toysId;
    public String name;

    @Override
    public String toString() {
        return  toysId +
                ". " + name +
                ", Остаток = " + count +
                ", Шанс выйгроша = " + weight +". \n";
    }

    public int count;
    public int weight;
    public toys(int toysId, String name, int count, int weight) {
        this.toysId = toysId;
        this.name = name;
        this.count = count;
        this.weight = weight;
    }


    public int getToysId() {
        return toysId;
    }

    public void setToysId(int toysId) {
        this.toysId = toysId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
