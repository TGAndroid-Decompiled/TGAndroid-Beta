package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f41424b;
    public final byte[] f41425c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f41424b = str;
        this.f41425c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f41424b, nVar.f41424b) && Arrays.equals(this.f41425c, nVar.f41425c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f41424b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f41425c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f41417a + ": owner=" + this.f41424b;
    }
}
