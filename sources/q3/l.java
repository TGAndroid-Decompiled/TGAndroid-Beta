package q3;

import java.util.Arrays;
public final class l extends i {
    public final int f43030b;
    public final int f43031c;
    public final int d;
    public final int[] e;
    public final int[] f43032f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f43030b = i10;
        this.f43031c = i11;
        this.d = i12;
        this.e = iArr;
        this.f43032f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f43030b == lVar.f43030b && this.f43031c == lVar.f43031c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f43032f, lVar.f43032f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f43032f) + ((hashCode + ((((((527 + this.f43030b) * 31) + this.f43031c) * 31) + this.d) * 31)) * 31);
    }
}
