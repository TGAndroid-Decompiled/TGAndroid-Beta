package z9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f51356a;
    public final byte[] f51357b;

    public f0(String str, byte[] bArr) {
        this.f51356a = str;
        this.f51357b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f51356a.equals(f0Var.f51356a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f51357b;
                } else {
                    bArr = f0Var.f51357b;
                }
                if (Arrays.equals(this.f51357b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51356a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f51357b);
    }

    public final String toString() {
        return "File{filename=" + this.f51356a + ", contents=" + Arrays.toString(this.f51357b) + "}";
    }
}
