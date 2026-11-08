package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f55411b;
    public final byte[] f55412c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f55411b = str;
        this.f55412c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f55411b, mVar.f55411b) && Arrays.equals(this.f55412c, mVar.f55412c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        String str = this.f55411b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return Arrays.hashCode(this.f55412c) + ((527 + i7) * 31);
    }

    @Override
    public final String toString() {
        return this.f55403a + ": owner=" + this.f55411b;
    }
}
