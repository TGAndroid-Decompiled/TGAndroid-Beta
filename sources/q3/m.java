package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f41152b;
    public final int f41153c;
    public final int d;
    public final int[] e;
    public final int[] f41154f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41152b = i10;
        this.f41153c = i11;
        this.d = i12;
        this.e = iArr;
        this.f41154f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f41152b == mVar.f41152b && this.f41153c == mVar.f41153c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f41154f, mVar.f41154f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f41154f) + ((hashCode + ((((((527 + this.f41152b) * 31) + this.f41153c) * 31) + this.d) * 31)) * 31);
    }
}
