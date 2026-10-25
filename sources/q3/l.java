package q3;

import java.util.Arrays;
public final class l extends i {
    public final int f46944b;
    public final int f46945c;
    public final int d;
    public final int[] e;
    public final int[] f46946f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f46944b = i10;
        this.f46945c = i11;
        this.d = i12;
        this.e = iArr;
        this.f46946f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f46944b == lVar.f46944b && this.f46945c == lVar.f46945c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f46946f, lVar.f46946f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f46946f) + ((hashCode + ((((((527 + this.f46944b) * 31) + this.f46945c) * 31) + this.d) * 31)) * 31);
    }
}
