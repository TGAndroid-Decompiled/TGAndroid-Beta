package y9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f52159a;
    public final byte[] f52160b;

    public f0(String str, byte[] bArr) {
        this.f52159a = str;
        this.f52160b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f52159a.equals(f0Var.f52159a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f52160b;
                } else {
                    bArr = f0Var.f52160b;
                }
                if (Arrays.equals(this.f52160b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f52159a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f52160b);
    }

    public final String toString() {
        return "File{filename=" + this.f52159a + ", contents=" + Arrays.toString(this.f52160b) + "}";
    }
}
