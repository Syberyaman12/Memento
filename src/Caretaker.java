import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<person.Memento> mementoList = new ArrayList<>();

    public void addMemento(person.Memento memento){
        mementoList.add(memento);
    }

    public person.Memento getMemento(int index) {
        return mementoList.get(index);
    }
}
