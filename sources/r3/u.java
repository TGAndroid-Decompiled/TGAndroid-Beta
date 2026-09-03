package r3;

import java.util.Arrays;
public final class u {
    public final int f43275a;
    public final byte[] f43276b;
    public final int f43277c;
    public final int d;

    public u(int i10, int i11, int i12, byte[] bArr) {
        this.f43275a = i10;
        this.f43276b = bArr;
        this.f43277c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f43275a == uVar.f43275a && this.f43277c == uVar.f43277c && this.d == uVar.d && Arrays.equals(this.f43276b, uVar.f43276b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f43276b) + (this.f43275a * 31)) * 31) + this.f43277c) * 31) + this.d;
    }
}
