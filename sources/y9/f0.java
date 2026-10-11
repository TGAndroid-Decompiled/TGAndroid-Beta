package y9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f52048a;
    public final byte[] f52049b;

    public f0(String str, byte[] bArr) {
        this.f52048a = str;
        this.f52049b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f52048a.equals(f0Var.f52048a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f52049b;
                } else {
                    bArr = f0Var.f52049b;
                }
                if (Arrays.equals(this.f52049b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f52048a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f52049b);
    }

    public final String toString() {
        return "File{filename=" + this.f52048a + ", contents=" + Arrays.toString(this.f52049b) + "}";
    }
}
