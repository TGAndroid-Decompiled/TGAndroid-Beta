package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f41418b;
    public final int f41419c;
    public final int d;
    public final int[] e;
    public final int[] f41420f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41418b = i10;
        this.f41419c = i11;
        this.d = i12;
        this.e = iArr;
        this.f41420f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f41418b == mVar.f41418b && this.f41419c == mVar.f41419c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f41420f, mVar.f41420f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f41420f) + ((hashCode + ((((((527 + this.f41418b) * 31) + this.f41419c) * 31) + this.d) * 31)) * 31);
    }
}
