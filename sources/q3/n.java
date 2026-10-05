package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f44805b;
    public final byte[] f44806c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f44805b = str;
        this.f44806c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f44805b, nVar.f44805b) && Arrays.equals(this.f44806c, nVar.f44806c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f44805b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f44806c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f44797a + ": owner=" + this.f44805b;
    }
}
