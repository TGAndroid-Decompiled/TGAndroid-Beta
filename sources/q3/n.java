package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f44164b;
    public final byte[] f44165c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f44164b = str;
        this.f44165c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f44164b, nVar.f44164b) && Arrays.equals(this.f44165c, nVar.f44165c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f44164b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f44165c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f44156a + ": owner=" + this.f44164b;
    }
}
