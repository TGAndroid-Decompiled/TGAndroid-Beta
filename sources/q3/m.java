package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f40507b;
    public final int f40508c;
    public final int d;
    public final int[] e;
    public final int[] f40509f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f40507b = i10;
        this.f40508c = i11;
        this.d = i12;
        this.e = iArr;
        this.f40509f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f40507b == mVar.f40507b && this.f40508c == mVar.f40508c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f40509f, mVar.f40509f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f40509f) + ((hashCode + ((((((527 + this.f40507b) * 31) + this.f40508c) * 31) + this.d) * 31)) * 31);
    }
}
