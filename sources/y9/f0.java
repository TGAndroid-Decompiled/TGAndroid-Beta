package y9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f46792a;
    public final byte[] f46793b;

    public f0(String str, byte[] bArr) {
        this.f46792a = str;
        this.f46793b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f46792a.equals(f0Var.f46792a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f46793b;
                } else {
                    bArr = f0Var.f46793b;
                }
                if (Arrays.equals(this.f46793b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46792a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f46793b);
    }

    public final String toString() {
        return "File{filename=" + this.f46792a + ", contents=" + Arrays.toString(this.f46793b) + "}";
    }
}
