package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f44787b;
    public final int f44788c;
    public final int d;
    public final int[] f44789e;
    public final int[] f44790f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44787b = i10;
        this.f44788c = i11;
        this.d = i12;
        this.f44789e = iArr;
        this.f44790f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f44787b == mVar.f44787b && this.f44788c == mVar.f44788c && this.d == mVar.d && Arrays.equals(this.f44789e, mVar.f44789e) && Arrays.equals(this.f44790f, mVar.f44790f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f44789e);
        return Arrays.hashCode(this.f44790f) + ((hashCode + ((((((527 + this.f44787b) * 31) + this.f44788c) * 31) + this.d) * 31)) * 31);
    }
}
