package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f45902b;
    public final int f45903c;
    public final int d;
    public final int[] f45904e;
    public final int[] f45905f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f45902b = i10;
        this.f45903c = i11;
        this.d = i12;
        this.f45904e = iArr;
        this.f45905f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f45902b == mVar.f45902b && this.f45903c == mVar.f45903c && this.d == mVar.d && Arrays.equals(this.f45904e, mVar.f45904e) && Arrays.equals(this.f45905f, mVar.f45905f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f45904e);
        return Arrays.hashCode(this.f45905f) + ((hashCode + ((((((527 + this.f45902b) * 31) + this.f45903c) * 31) + this.d) * 31)) * 31);
    }
}
