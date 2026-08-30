package r3;

import java.util.Arrays;
public final class u {
    public final int f43251a;
    public final byte[] f43252b;
    public final int f43253c;
    public final int d;

    public u(int i10, int i11, int i12, byte[] bArr) {
        this.f43251a = i10;
        this.f43252b = bArr;
        this.f43253c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f43251a == uVar.f43251a && this.f43253c == uVar.f43253c && this.d == uVar.d && Arrays.equals(this.f43252b, uVar.f43252b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f43252b) + (this.f43251a * 31)) * 31) + this.f43253c) * 31) + this.d;
    }
}
