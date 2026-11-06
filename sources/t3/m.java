package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f55319b;
    public final byte[] f55320c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f55319b = str;
        this.f55320c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f55319b, mVar.f55319b) && Arrays.equals(this.f55320c, mVar.f55320c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        String str = this.f55319b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return Arrays.hashCode(this.f55320c) + ((527 + i7) * 31);
    }

    @Override
    public final String toString() {
        return this.f55311a + ": owner=" + this.f55319b;
    }
}
