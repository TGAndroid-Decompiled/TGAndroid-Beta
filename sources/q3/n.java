package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f45449b;
    public final byte[] f45450c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f45449b = str;
        this.f45450c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f45449b, nVar.f45449b) && Arrays.equals(this.f45450c, nVar.f45450c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f45449b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f45450c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f45442a + ": owner=" + this.f45449b;
    }
}
