package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f41394b;
    public final byte[] f41395c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f41394b = str;
        this.f41395c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f41394b, nVar.f41394b) && Arrays.equals(this.f41395c, nVar.f41395c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f41394b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f41395c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f41387a + ": owner=" + this.f41394b;
    }
}
