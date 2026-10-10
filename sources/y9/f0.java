package y9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f51971a;
    public final byte[] f51972b;

    public f0(String str, byte[] bArr) {
        this.f51971a = str;
        this.f51972b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f51971a.equals(f0Var.f51971a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f51972b;
                } else {
                    bArr = f0Var.f51972b;
                }
                if (Arrays.equals(this.f51972b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51971a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f51972b);
    }

    public final String toString() {
        return "File{filename=" + this.f51971a + ", contents=" + Arrays.toString(this.f51972b) + "}";
    }
}
