package r3;

import java.util.Arrays;
public final class u {
    public final int f46587a;
    public final byte[] f46588b;
    public final int f46589c;
    public final int d;

    public u(int i10, int i11, int i12, byte[] bArr) {
        this.f46587a = i10;
        this.f46588b = bArr;
        this.f46589c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f46587a == uVar.f46587a && this.f46589c == uVar.f46589c && this.d == uVar.d && Arrays.equals(this.f46588b, uVar.f46588b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f46588b) + (this.f46587a * 31)) * 31) + this.f46589c) * 31) + this.d;
    }
}
