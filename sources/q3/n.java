package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f45460b;
    public final byte[] f45461c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f45460b = str;
        this.f45461c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f45460b, nVar.f45460b) && Arrays.equals(this.f45461c, nVar.f45461c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f45460b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f45461c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f45453a + ": owner=" + this.f45460b;
    }
}
