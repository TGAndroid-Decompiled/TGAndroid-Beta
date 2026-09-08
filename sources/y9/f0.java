package y9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f49778a;
    public final byte[] f49779b;

    public f0(String str, byte[] bArr) {
        this.f49778a = str;
        this.f49779b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f49778a.equals(f0Var.f49778a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f49779b;
                } else {
                    bArr = f0Var.f49779b;
                }
                if (Arrays.equals(this.f49779b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49778a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f49779b);
    }

    public final String toString() {
        return "File{filename=" + this.f49778a + ", contents=" + Arrays.toString(this.f49779b) + "}";
    }
}
