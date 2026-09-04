package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f44163b;
    public final byte[] f44164c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f44163b = str;
        this.f44164c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f44163b, nVar.f44163b) && Arrays.equals(this.f44164c, nVar.f44164c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f44163b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f44164c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f44155a + ": owner=" + this.f44163b;
    }
}
