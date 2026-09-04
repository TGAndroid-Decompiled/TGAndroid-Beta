package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f44159b;
    public final int f44160c;
    public final int d;
    public final int[] f44161e;
    public final int[] f44162f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44159b = i10;
        this.f44160c = i11;
        this.d = i12;
        this.f44161e = iArr;
        this.f44162f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f44159b == mVar.f44159b && this.f44160c == mVar.f44160c && this.d == mVar.d && Arrays.equals(this.f44161e, mVar.f44161e) && Arrays.equals(this.f44162f, mVar.f44162f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f44161e);
        return Arrays.hashCode(this.f44162f) + ((hashCode + ((((((527 + this.f44159b) * 31) + this.f44160c) * 31) + this.d) * 31)) * 31);
    }
}
