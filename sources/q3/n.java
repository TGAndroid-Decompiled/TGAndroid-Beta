package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f41408b;
    public final byte[] f41409c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f41408b = str;
        this.f41409c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f41408b, nVar.f41408b) && Arrays.equals(this.f41409c, nVar.f41409c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f41408b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f41409c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f41401a + ": owner=" + this.f41408b;
    }
}
