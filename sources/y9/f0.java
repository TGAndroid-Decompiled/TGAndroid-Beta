package y9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f49749a;
    public final byte[] f49750b;

    public f0(String str, byte[] bArr) {
        this.f49749a = str;
        this.f49750b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f49749a.equals(f0Var.f49749a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f49750b;
                } else {
                    bArr = f0Var.f49750b;
                }
                if (Arrays.equals(this.f49750b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49749a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f49750b);
    }

    public final String toString() {
        return "File{filename=" + this.f49749a + ", contents=" + Arrays.toString(this.f49750b) + "}";
    }
}
