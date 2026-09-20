package w7;
public abstract class i9 {
    public static void a(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(hg.k0.h(i11, "at index "));
            }
        }
    }
}
