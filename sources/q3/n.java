package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f44191b;
    public final byte[] f44192c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f44191b = str;
        this.f44192c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f44191b, nVar.f44191b) && Arrays.equals(this.f44192c, nVar.f44192c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f44191b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f44192c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f44183a + ": owner=" + this.f44191b;
    }
}
