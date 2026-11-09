package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f55423b;
    public final byte[] f55424c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f55423b = str;
        this.f55424c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f55423b, mVar.f55423b) && Arrays.equals(this.f55424c, mVar.f55424c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        String str = this.f55423b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return Arrays.hashCode(this.f55424c) + ((527 + i7) * 31);
    }

    @Override
    public final String toString() {
        return this.f55415a + ": owner=" + this.f55423b;
    }
}
