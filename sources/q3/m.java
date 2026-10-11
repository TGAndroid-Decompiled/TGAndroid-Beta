package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f46032b;
    public final int f46033c;
    public final int d;
    public final int[] f46034e;
    public final int[] f46035f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f46032b = i10;
        this.f46033c = i11;
        this.d = i12;
        this.f46034e = iArr;
        this.f46035f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f46032b == mVar.f46032b && this.f46033c == mVar.f46033c && this.d == mVar.d && Arrays.equals(this.f46034e, mVar.f46034e) && Arrays.equals(this.f46035f, mVar.f46035f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f46034e);
        return Arrays.hashCode(this.f46035f) + ((hashCode + ((((((527 + this.f46032b) * 31) + this.f46033c) * 31) + this.d) * 31)) * 31);
    }
}
