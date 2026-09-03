package r3;

import java.util.Arrays;
public final class u {
    public final int f46618a;
    public final byte[] f46619b;
    public final int f46620c;
    public final int d;

    public u(int i10, int i11, int i12, byte[] bArr) {
        this.f46618a = i10;
        this.f46619b = bArr;
        this.f46620c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f46618a == uVar.f46618a && this.f46620c == uVar.f46620c && this.d == uVar.d && Arrays.equals(this.f46619b, uVar.f46619b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f46619b) + (this.f46618a * 31)) * 31) + this.f46620c) * 31) + this.d;
    }
}
