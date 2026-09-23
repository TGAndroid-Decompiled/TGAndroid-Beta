package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f41085b;
    public final byte[] f41086c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f41085b = str;
        this.f41086c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f41085b, nVar.f41085b) && Arrays.equals(this.f41086c, nVar.f41086c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f41085b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f41086c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f41078a + ": owner=" + this.f41085b;
    }
}
