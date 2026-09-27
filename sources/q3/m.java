package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f41449b;
    public final int f41450c;
    public final int d;
    public final int[] e;
    public final int[] f41451f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41449b = i10;
        this.f41450c = i11;
        this.d = i12;
        this.e = iArr;
        this.f41451f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f41449b == mVar.f41449b && this.f41450c == mVar.f41450c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f41451f, mVar.f41451f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f41451f) + ((hashCode + ((((((527 + this.f41449b) * 31) + this.f41450c) * 31) + this.d) * 31)) * 31);
    }
}
