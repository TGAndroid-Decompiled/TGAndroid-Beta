package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f41421b;
    public final int f41422c;
    public final int d;
    public final int[] e;
    public final int[] f41423f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41421b = i10;
        this.f41422c = i11;
        this.d = i12;
        this.e = iArr;
        this.f41423f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f41421b == mVar.f41421b && this.f41422c == mVar.f41422c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f41423f, mVar.f41423f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f41423f) + ((hashCode + ((((((527 + this.f41421b) * 31) + this.f41422c) * 31) + this.d) * 31)) * 31);
    }
}
