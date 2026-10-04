package y9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f50631a;
    public final byte[] f50632b;

    public f0(String str, byte[] bArr) {
        this.f50631a = str;
        this.f50632b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f50631a.equals(f0Var.f50631a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f50632b;
                } else {
                    bArr = f0Var.f50632b;
                }
                if (Arrays.equals(this.f50632b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50631a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f50632b);
    }

    public final String toString() {
        return "File{filename=" + this.f50631a + ", contents=" + Arrays.toString(this.f50632b) + "}";
    }
}
