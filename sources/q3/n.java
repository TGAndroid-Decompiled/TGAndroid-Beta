package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f41452b;
    public final byte[] f41453c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f41452b = str;
        this.f41453c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f41452b, nVar.f41452b) && Arrays.equals(this.f41453c, nVar.f41453c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f41452b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f41453c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f41445a + ": owner=" + this.f41452b;
    }
}
