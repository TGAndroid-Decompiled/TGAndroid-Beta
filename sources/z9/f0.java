package z9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f55275a;
    public final byte[] f55276b;

    public f0(String str, byte[] bArr) {
        this.f55275a = str;
        this.f55276b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f55275a.equals(f0Var.f55275a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f55276b;
                } else {
                    bArr = f0Var.f55276b;
                }
                if (Arrays.equals(this.f55276b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f55275a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f55276b);
    }

    public final String toString() {
        return "File{filename=" + this.f55275a + ", contents=" + Arrays.toString(this.f55276b) + "}";
    }
}
