package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f45961b;
    public final byte[] f45962c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f45961b = str;
        this.f45962c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f45961b, nVar.f45961b) && Arrays.equals(this.f45962c, nVar.f45962c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f45961b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f45962c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f45953a + ": owner=" + this.f45961b;
    }
}
