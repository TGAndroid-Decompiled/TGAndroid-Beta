package q3;

import java.util.Arrays;
public final class l extends i {
    public final int f44371b;
    public final int f44372c;
    public final int d;
    public final int[] e;
    public final int[] f44373f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44371b = i10;
        this.f44372c = i11;
        this.d = i12;
        this.e = iArr;
        this.f44373f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f44371b == lVar.f44371b && this.f44372c == lVar.f44372c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f44373f, lVar.f44373f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f44373f) + ((hashCode + ((((((527 + this.f44371b) * 31) + this.f44372c) * 31) + this.d) * 31)) * 31);
    }
}
