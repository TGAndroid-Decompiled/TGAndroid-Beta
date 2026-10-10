package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f46005b;
    public final byte[] f46006c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f46005b = str;
        this.f46006c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f46005b, nVar.f46005b) && Arrays.equals(this.f46006c, nVar.f46006c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f46005b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f46006c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f45997a + ": owner=" + this.f46005b;
    }
}
