package z9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f51358a;
    public final byte[] f51359b;

    public f0(String str, byte[] bArr) {
        this.f51358a = str;
        this.f51359b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f51358a.equals(f0Var.f51358a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f51359b;
                } else {
                    bArr = f0Var.f51359b;
                }
                if (Arrays.equals(this.f51359b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51358a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f51359b);
    }

    public final String toString() {
        return "File{filename=" + this.f51358a + ", contents=" + Arrays.toString(this.f51359b) + "}";
    }
}
