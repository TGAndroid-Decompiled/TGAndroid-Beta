package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f45906b;
    public final byte[] f45907c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f45906b = str;
        this.f45907c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f45906b, nVar.f45906b) && Arrays.equals(this.f45907c, nVar.f45907c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f45906b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f45907c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f45898a + ": owner=" + this.f45906b;
    }
}
