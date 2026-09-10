package v7;
public abstract class b8 {
    public static void a(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException(a4.a.l(i10, i11, "fromIndex: ", " > toIndex: "));
        }
        StringBuilder n10 = hc.b.n("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
        n10.append(i12);
        throw new IndexOutOfBoundsException(n10.toString());
    }
}
