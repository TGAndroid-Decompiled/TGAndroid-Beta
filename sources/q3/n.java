package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f44192b;
    public final byte[] f44193c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f44192b = str;
        this.f44193c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f44192b, nVar.f44192b) && Arrays.equals(this.f44193c, nVar.f44193c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f44192b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f44193c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f44184a + ": owner=" + this.f44192b;
    }
}
