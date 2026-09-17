package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f44160b;
    public final int f44161c;
    public final int d;
    public final int[] f44162e;
    public final int[] f44163f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44160b = i10;
        this.f44161c = i11;
        this.d = i12;
        this.f44162e = iArr;
        this.f44163f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f44160b == mVar.f44160b && this.f44161c == mVar.f44161c && this.d == mVar.d && Arrays.equals(this.f44162e, mVar.f44162e) && Arrays.equals(this.f44163f, mVar.f44163f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f44162e);
        return Arrays.hashCode(this.f44163f) + ((hashCode + ((((((527 + this.f44160b) * 31) + this.f44161c) * 31) + this.d) * 31)) * 31);
    }
}
