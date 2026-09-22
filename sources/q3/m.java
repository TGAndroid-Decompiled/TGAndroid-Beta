package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f41453b;
    public final int f41454c;
    public final int d;
    public final int[] e;
    public final int[] f41455f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41453b = i10;
        this.f41454c = i11;
        this.d = i12;
        this.e = iArr;
        this.f41455f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f41453b == mVar.f41453b && this.f41454c == mVar.f41454c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f41455f, mVar.f41455f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f41455f) + ((hashCode + ((((((527 + this.f41453b) * 31) + this.f41454c) * 31) + this.d) * 31)) * 31);
    }
}
