package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f57581b;
    public final byte[] f57582c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f57581b = str;
        this.f57582c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f57581b, mVar.f57581b) && Arrays.equals(this.f57582c, mVar.f57582c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        String str = this.f57581b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return Arrays.hashCode(this.f57582c) + ((527 + i7) * 31);
    }

    @Override
    public final String toString() {
        return this.f57573a + ": owner=" + this.f57581b;
    }
}
