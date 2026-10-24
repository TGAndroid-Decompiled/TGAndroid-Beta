package z9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f51827a;
    public final byte[] f51828b;

    public f0(String str, byte[] bArr) {
        this.f51827a = str;
        this.f51828b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f51827a.equals(f0Var.f51827a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f51828b;
                } else {
                    bArr = f0Var.f51828b;
                }
                if (Arrays.equals(this.f51828b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51827a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f51828b);
    }

    public final String toString() {
        return "File{filename=" + this.f51827a + ", contents=" + Arrays.toString(this.f51828b) + "}";
    }
}
