package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f44421b;
    public final byte[] f44422c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f44421b = str;
        this.f44422c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f44421b, mVar.f44421b) && Arrays.equals(this.f44422c, mVar.f44422c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f44421b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f44422c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f44414a + ": owner=" + this.f44421b;
    }
}
