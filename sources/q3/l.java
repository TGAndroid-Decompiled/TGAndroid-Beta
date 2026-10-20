package q3;

import java.util.Arrays;
public final class l extends i {
    public final int f44379b;
    public final int f44380c;
    public final int d;
    public final int[] e;
    public final int[] f44381f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44379b = i10;
        this.f44380c = i11;
        this.d = i12;
        this.e = iArr;
        this.f44381f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f44379b == lVar.f44379b && this.f44380c == lVar.f44380c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f44381f, lVar.f44381f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f44381f) + ((hashCode + ((((((527 + this.f44379b) * 31) + this.f44380c) * 31) + this.d) * 31)) * 31);
    }
}
