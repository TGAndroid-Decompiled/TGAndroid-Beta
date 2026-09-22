package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f41129b;
    public final byte[] f41130c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f41129b = str;
        this.f41130c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f41129b, nVar.f41129b) && Arrays.equals(this.f41130c, nVar.f41130c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f41129b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f41130c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f41122a + ": owner=" + this.f41129b;
    }
}
