package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f44187b;
    public final int f44188c;
    public final int d;
    public final int[] f44189e;
    public final int[] f44190f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44187b = i10;
        this.f44188c = i11;
        this.d = i12;
        this.f44189e = iArr;
        this.f44190f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f44187b == mVar.f44187b && this.f44188c == mVar.f44188c && this.d == mVar.d && Arrays.equals(this.f44189e, mVar.f44189e) && Arrays.equals(this.f44190f, mVar.f44190f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f44189e);
        return Arrays.hashCode(this.f44190f) + ((hashCode + ((((((527 + this.f44187b) * 31) + this.f44188c) * 31) + this.d) * 31)) * 31);
    }
}
