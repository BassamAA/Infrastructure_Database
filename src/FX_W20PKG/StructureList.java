package FX_W20PKG;

public class StructureList implements Cloneable {

    private class StructureNode {

        private Structure sObj;
        private StructureNode next;

        public StructureNode() {
            sObj = null;
            next = null;
        }

        public StructureNode(Structure newStruc, StructureNode nextValue) {

            sObj = newStruc;
            next = nextValue;

        }

    }

    private StructureNode head;

    public void addToStart(Structure struct) {

        head = new StructureNode(struct, head);
    }

    public void addToEnd(Structure struct) {

        StructureNode s1 = head;

        if (head == null) {
            head = new StructureNode(struct, null);
        } else {

            while ((s1.next != null)) {
                s1 = s1.next;

            }
            StructureNode newStruct = new StructureNode(struct, s1.next);
            s1.next = newStruct;

        }

    }

    public void append(StructureList stList) {

        StructureNode s1 = stList.head;
        while ((s1.next != null)) {
            Structure structureCopy = (Structure) s1.sObj.clone();
            addToEnd(structureCopy);
            s1 = s1.next;
        }

        stList.head = null;


    }


    public void showListContents() {

        StructureNode s1 = head;
        String c = "";

        while (s1 != null) {

            c += s1.sObj.toString() + " ===> \n";
            s1 = s1.next;


        }

        c += "X ";
        System.out.println(c);

    }

    public Object clone() {

        return (Object) new StructureList(this);

    }

    public StructureList() {

        head = null;
    }

    public StructureList(StructureList SL) {

        if (SL.head == null || SL == null) {
            head = null;
            return;
        } else {
            head = new StructureNode(SL.head.sObj, null);
            StructureNode oldPointer = SL.head;
            StructureNode newPointer = head;

            while (oldPointer.next != null) {

                newPointer.next = new StructureNode(oldPointer.next.sObj, null);
                oldPointer = oldPointer.next;
                newPointer = newPointer.next;
            }

        }


    }

}




