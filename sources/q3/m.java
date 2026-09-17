package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f44188b;
    public final int f44189c;
    public final int d;
    public final int[] f44190e;
    public final int[] f44191f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44188b = i10;
        this.f44189c = i11;
        this.d = i12;
        this.f44190e = iArr;
        this.f44191f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f44188b == mVar.f44188b && this.f44189c == mVar.f44189c && this.d == mVar.d && Arrays.equals(this.f44190e, mVar.f44190e) && Arrays.equals(this.f44191f, mVar.f44191f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f44190e);
        return Arrays.hashCode(this.f44191f) + ((hashCode + ((((((527 + this.f44188b) * 31) + this.f44189c) * 31) + this.d) * 31)) * 31);
    }
}
