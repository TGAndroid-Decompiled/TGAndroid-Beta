package y9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f49750a;
    public final byte[] f49751b;

    public f0(String str, byte[] bArr) {
        this.f49750a = str;
        this.f49751b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f49750a.equals(f0Var.f49750a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f49751b;
                } else {
                    bArr = f0Var.f49751b;
                }
                if (Arrays.equals(this.f49751b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49750a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f49751b);
    }

    public final String toString() {
        return "File{filename=" + this.f49750a + ", contents=" + Arrays.toString(this.f49751b) + "}";
    }
}
