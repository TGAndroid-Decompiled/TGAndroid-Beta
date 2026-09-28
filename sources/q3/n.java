package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f41422b;
    public final byte[] f41423c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f41422b = str;
        this.f41423c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f41422b, nVar.f41422b) && Arrays.equals(this.f41423c, nVar.f41423c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f41422b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f41423c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f41415a + ": owner=" + this.f41422b;
    }
}
