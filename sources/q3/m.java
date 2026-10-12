package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f45894b;
    public final int f45895c;
    public final int d;
    public final int[] f45896e;
    public final int[] f45897f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f45894b = i10;
        this.f45895c = i11;
        this.d = i12;
        this.f45896e = iArr;
        this.f45897f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f45894b == mVar.f45894b && this.f45895c == mVar.f45895c && this.d == mVar.d && Arrays.equals(this.f45896e, mVar.f45896e) && Arrays.equals(this.f45897f, mVar.f45897f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f45896e);
        return Arrays.hashCode(this.f45897f) + ((hashCode + ((((((527 + this.f45894b) * 31) + this.f45895c) * 31) + this.d) * 31)) * 31);
    }
}
