package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f41423b;
    public final byte[] f41424c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f41423b = str;
        this.f41424c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f41423b, nVar.f41423b) && Arrays.equals(this.f41424c, nVar.f41424c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f41423b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f41424c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f41416a + ": owner=" + this.f41423b;
    }
}
