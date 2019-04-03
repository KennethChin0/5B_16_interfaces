public interface OrderedList {
        // retunrs number of elements
        public int size();

        //returns a string representation of the list
        public String toString();

        //adds a given value at a index
        public void add(int value);

        //returns the value of an element at a given index
        public int get(int index);

        // removes a value at a given inex and returns it
        public int remove(int index);

}
