package y9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f46512a;
    public final byte[] f46513b;

    public f0(String str, byte[] bArr) {
        this.f46512a = str;
        this.f46513b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f46512a.equals(f0Var.f46512a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f46513b;
                } else {
                    bArr = f0Var.f46513b;
                }
                if (Arrays.equals(this.f46513b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46512a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f46513b);
    }

    public final String toString() {
        return "File{filename=" + this.f46512a + ", contents=" + Arrays.toString(this.f46513b) + "}";
    }
}
