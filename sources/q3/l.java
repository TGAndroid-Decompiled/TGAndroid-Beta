package q3;

import java.util.Arrays;
public final class l extends i {
    public final int f43287b;
    public final int f43288c;
    public final int d;
    public final int[] e;
    public final int[] f43289f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f43287b = i10;
        this.f43288c = i11;
        this.d = i12;
        this.e = iArr;
        this.f43289f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f43287b == lVar.f43287b && this.f43288c == lVar.f43288c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f43289f, lVar.f43289f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f43289f) + ((hashCode + ((((((527 + this.f43287b) * 31) + this.f43288c) * 31) + this.d) * 31)) * 31);
    }
}
