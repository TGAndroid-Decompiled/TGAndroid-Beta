package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f41133b;
    public final byte[] f41134c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f41133b = str;
        this.f41134c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f41133b, nVar.f41133b) && Arrays.equals(this.f41134c, nVar.f41134c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f41133b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f41134c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f41126a + ": owner=" + this.f41133b;
    }
}
