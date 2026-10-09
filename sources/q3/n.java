package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f45959b;
    public final byte[] f45960c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f45959b = str;
        this.f45960c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f45959b, nVar.f45959b) && Arrays.equals(this.f45960c, nVar.f45960c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f45959b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f45960c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f45951a + ": owner=" + this.f45959b;
    }
}
