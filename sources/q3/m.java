package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f46985b;
    public final byte[] f46986c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f46985b = str;
        this.f46986c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f46985b, mVar.f46985b) && Arrays.equals(this.f46986c, mVar.f46986c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f46985b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f46986c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f46978a + ": owner=" + this.f46985b;
    }
}
