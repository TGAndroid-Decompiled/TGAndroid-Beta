package v7;
public abstract class s8 {
    public static void a(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException(a1.g.l(i10, i11, "fromIndex: ", " > toIndex: "));
        }
        StringBuilder m10 = i0.a.m("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
        m10.append(i12);
        throw new IndexOutOfBoundsException(m10.toString());
    }
}
