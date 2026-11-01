package z9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f55293a;
    public final byte[] f55294b;

    public f0(String str, byte[] bArr) {
        this.f55293a = str;
        this.f55294b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f55293a.equals(f0Var.f55293a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f55294b;
                } else {
                    bArr = f0Var.f55294b;
                }
                if (Arrays.equals(this.f55294b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f55293a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f55294b);
    }

    public final String toString() {
        return "File{filename=" + this.f55293a + ", contents=" + Arrays.toString(this.f55294b) + "}";
    }
}
