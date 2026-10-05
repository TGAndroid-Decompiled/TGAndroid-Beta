package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f44801b;
    public final int f44802c;
    public final int d;
    public final int[] f44803e;
    public final int[] f44804f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44801b = i10;
        this.f44802c = i11;
        this.d = i12;
        this.f44803e = iArr;
        this.f44804f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f44801b == mVar.f44801b && this.f44802c == mVar.f44802c && this.d == mVar.d && Arrays.equals(this.f44803e, mVar.f44803e) && Arrays.equals(this.f44804f, mVar.f44804f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f44803e);
        return Arrays.hashCode(this.f44804f) + ((hashCode + ((((((527 + this.f44801b) * 31) + this.f44802c) * 31) + this.d) * 31)) * 31);
    }
}
