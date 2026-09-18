package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f41160b;
    public final byte[] f41161c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f41160b = str;
        this.f41161c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f41160b, nVar.f41160b) && Arrays.equals(this.f41161c, nVar.f41161c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f41160b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f41161c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f41153a + ": owner=" + this.f41160b;
    }
}
