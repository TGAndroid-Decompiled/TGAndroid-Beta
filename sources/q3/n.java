package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f46070b;
    public final byte[] f46071c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f46070b = str;
        this.f46071c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f46070b, nVar.f46070b) && Arrays.equals(this.f46071c, nVar.f46071c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f46070b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f46071c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f46062a + ": owner=" + this.f46070b;
    }
}
