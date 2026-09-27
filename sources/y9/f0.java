package y9;

import java.util.Arrays;
public final class f0 extends i1 {
    public final String f46836a;
    public final byte[] f46837b;

    public f0(String str, byte[] bArr) {
        this.f46836a = str;
        this.f46837b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            f0 f0Var = (f0) i1Var;
            if (this.f46836a.equals(f0Var.f46836a)) {
                if (i1Var instanceof f0) {
                    bArr = ((f0) i1Var).f46837b;
                } else {
                    bArr = f0Var.f46837b;
                }
                if (Arrays.equals(this.f46837b, bArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46836a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f46837b);
    }

    public final String toString() {
        return "File{filename=" + this.f46836a + ", contents=" + Arrays.toString(this.f46837b) + "}";
    }
}
