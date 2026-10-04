package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f44791b;
    public final byte[] f44792c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f44791b = str;
        this.f44792c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f44791b, nVar.f44791b) && Arrays.equals(this.f44792c, nVar.f44792c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f44791b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f44792c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f44783a + ": owner=" + this.f44791b;
    }
}
