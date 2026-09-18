package v7;
public abstract class b8 {
    public static void a(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException(a4.a.l(i10, i11, "fromIndex: ", " > toIndex: "));
        }
        StringBuilder m10 = hg.k0.m("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
        m10.append(i12);
        throw new IndexOutOfBoundsException(m10.toString());
    }
}
