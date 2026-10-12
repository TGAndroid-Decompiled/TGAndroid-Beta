package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f45898b;
    public final byte[] f45899c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f45898b = str;
        this.f45899c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f45898b, nVar.f45898b) && Arrays.equals(this.f45899c, nVar.f45899c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f45898b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f45899c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f45890a + ": owner=" + this.f45898b;
    }
}
