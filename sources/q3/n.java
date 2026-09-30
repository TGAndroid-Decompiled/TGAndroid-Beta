package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f41521b;
    public final byte[] f41522c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f41521b = str;
        this.f41522c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f41521b, nVar.f41521b) && Arrays.equals(this.f41522c, nVar.f41522c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f41521b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f41522c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f41514a + ": owner=" + this.f41521b;
    }
}
