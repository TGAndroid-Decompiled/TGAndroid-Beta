package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f45955b;
    public final int f45956c;
    public final int d;
    public final int[] f45957e;
    public final int[] f45958f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f45955b = i10;
        this.f45956c = i11;
        this.d = i12;
        this.f45957e = iArr;
        this.f45958f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f45955b == mVar.f45955b && this.f45956c == mVar.f45956c && this.d == mVar.d && Arrays.equals(this.f45957e, mVar.f45957e) && Arrays.equals(this.f45958f, mVar.f45958f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f45957e);
        return Arrays.hashCode(this.f45958f) + ((hashCode + ((((((527 + this.f45955b) * 31) + this.f45956c) * 31) + this.d) * 31)) * 31);
    }
}
