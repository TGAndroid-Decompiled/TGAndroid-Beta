package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f55294b;
    public final byte[] f55295c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f55294b = str;
        this.f55295c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f55294b, mVar.f55294b) && Arrays.equals(this.f55295c, mVar.f55295c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        String str = this.f55294b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return Arrays.hashCode(this.f55295c) + ((527 + i7) * 31);
    }

    @Override
    public final String toString() {
        return this.f55286a + ": owner=" + this.f55294b;
    }
}
