package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f43290b;
    public final byte[] f43291c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f43290b = str;
        this.f43291c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f43290b, mVar.f43290b) && Arrays.equals(this.f43291c, mVar.f43291c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f43290b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f43291c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f43283a + ": owner=" + this.f43290b;
    }
}
