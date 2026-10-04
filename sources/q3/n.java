package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f44798b;
    public final byte[] f44799c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f44798b = str;
        this.f44799c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f44798b, nVar.f44798b) && Arrays.equals(this.f44799c, nVar.f44799c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f44798b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f44799c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f44790a + ": owner=" + this.f44798b;
    }
}
