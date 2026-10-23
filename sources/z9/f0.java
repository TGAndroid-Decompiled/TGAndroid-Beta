package z9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f51828a;
    public final byte[] f51829b;

    public f0(String str, byte[] bArr) {
        this.f51828a = str;
        this.f51829b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f51828a.equals(f0Var.f51828a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f51829b;
                } else {
                    bArr = f0Var.f51829b;
                }
                if (Arrays.equals(this.f51829b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51828a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f51829b);
    }

    public final String toString() {
        return "File{filename=" + this.f51828a + ", contents=" + Arrays.toString(this.f51829b) + "}";
    }
}
