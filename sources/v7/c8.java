package v7;
public abstract class c8 {
    public static void a(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException(a4.a.m(i10, i11, "fromIndex: ", " > toIndex: "));
        }
        StringBuilder k10 = hg.c.k("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
        k10.append(i12);
        throw new IndexOutOfBoundsException(k10.toString());
    }
}
