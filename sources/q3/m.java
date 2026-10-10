package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f46001b;
    public final int f46002c;
    public final int d;
    public final int[] f46003e;
    public final int[] f46004f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f46001b = i10;
        this.f46002c = i11;
        this.d = i12;
        this.f46003e = iArr;
        this.f46004f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f46001b == mVar.f46001b && this.f46002c == mVar.f46002c && this.d == mVar.d && Arrays.equals(this.f46003e, mVar.f46003e) && Arrays.equals(this.f46004f, mVar.f46004f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f46003e);
        return Arrays.hashCode(this.f46004f) + ((hashCode + ((((((527 + this.f46001b) * 31) + this.f46002c) * 31) + this.d) * 31)) * 31);
    }
}
