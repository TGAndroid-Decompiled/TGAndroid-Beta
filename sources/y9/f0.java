package y9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f52014a;
    public final byte[] f52015b;

    public f0(String str, byte[] bArr) {
        this.f52014a = str;
        this.f52015b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f52014a.equals(f0Var.f52014a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f52015b;
                } else {
                    bArr = f0Var.f52015b;
                }
                if (Arrays.equals(this.f52015b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f52014a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f52015b);
    }

    public final String toString() {
        return "File{filename=" + this.f52014a + ", contents=" + Arrays.toString(this.f52015b) + "}";
    }
}
