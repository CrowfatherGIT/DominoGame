public class BonesArray {

    private ObjectArray aBones;

    private static BonesArray all() {
        BonesArray array = new BonesArray();

        for (int left = 0; left < 7; left++) {
            for (int right = 0; right < 7; right++) {
                array.aBones.add(0, new Bone(left, right));
            }
        }

        return array;
    }


    @Override
    public String toString() {
        return aBones.toString(arr);
    }

    private BonesArray() {
        aBones = new ObjectArray(ObjectArray array);
        aBones = array;

        public void shuffle() {
            aBones.shuffle();
        }
    }

    public void put(int index, Bone bone) {
        aBones.add()

    }


}
