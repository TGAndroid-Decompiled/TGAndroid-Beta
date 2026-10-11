package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f46066b;
    public final int f46067c;
    public final int d;
    public final int[] f46068e;
    public final int[] f46069f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f46066b = i10;
        this.f46067c = i11;
        this.d = i12;
        this.f46068e = iArr;
        this.f46069f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f46066b == mVar.f46066b && this.f46067c == mVar.f46067c && this.d == mVar.d && Arrays.equals(this.f46068e, mVar.f46068e) && Arrays.equals(this.f46069f, mVar.f46069f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f46068e);
        return Arrays.hashCode(this.f46069f) + ((hashCode + ((((((527 + this.f46066b) * 31) + this.f46067c) * 31) + this.d) * 31)) * 31);
    }
}
