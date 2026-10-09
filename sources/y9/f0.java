package y9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f51925a;
    public final byte[] f51926b;

    public f0(String str, byte[] bArr) {
        this.f51925a = str;
        this.f51926b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f51925a.equals(f0Var.f51925a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f51926b;
                } else {
                    bArr = f0Var.f51926b;
                }
                if (Arrays.equals(this.f51926b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51925a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f51926b);
    }

    public final String toString() {
        return "File{filename=" + this.f51925a + ", contents=" + Arrays.toString(this.f51926b) + "}";
    }
}
