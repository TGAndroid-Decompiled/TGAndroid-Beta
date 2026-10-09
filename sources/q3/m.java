package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f45957b;
    public final int f45958c;
    public final int d;
    public final int[] f45959e;
    public final int[] f45960f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f45957b = i10;
        this.f45958c = i11;
        this.d = i12;
        this.f45959e = iArr;
        this.f45960f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f45957b == mVar.f45957b && this.f45958c == mVar.f45958c && this.d == mVar.d && Arrays.equals(this.f45959e, mVar.f45959e) && Arrays.equals(this.f45960f, mVar.f45960f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f45959e);
        return Arrays.hashCode(this.f45960f) + ((hashCode + ((((((527 + this.f45957b) * 31) + this.f45958c) * 31) + this.d) * 31)) * 31);
    }
}
