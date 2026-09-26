package y9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f46790a;
    public final byte[] f46791b;

    public f0(String str, byte[] bArr) {
        this.f46790a = str;
        this.f46791b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f46790a.equals(f0Var.f46790a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f46791b;
                } else {
                    bArr = f0Var.f46791b;
                }
                if (Arrays.equals(this.f46791b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46790a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f46791b);
    }

    public final String toString() {
        return "File{filename=" + this.f46790a + ", contents=" + Arrays.toString(this.f46791b) + "}";
    }
}
