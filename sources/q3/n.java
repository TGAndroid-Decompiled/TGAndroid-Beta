package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f41155b;
    public final byte[] f41156c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f41155b = str;
        this.f41156c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f41155b, nVar.f41155b) && Arrays.equals(this.f41156c, nVar.f41156c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f41155b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f41156c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f41148a + ": owner=" + this.f41155b;
    }
}
