package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f41456b;
    public final byte[] f41457c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f41456b = str;
        this.f41457c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f41456b, nVar.f41456b) && Arrays.equals(this.f41457c, nVar.f41457c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f41456b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f41457c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f41449a + ": owner=" + this.f41456b;
    }
}
