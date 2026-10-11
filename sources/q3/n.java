package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class n extends j {
    public final String f46036b;
    public final byte[] f46037c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f46036b = str;
        this.f46037c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f46036b, nVar.f46036b) && Arrays.equals(this.f46037c, nVar.f46037c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f46036b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f46037c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f46028a + ": owner=" + this.f46036b;
    }
}
