package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f44385b;
    public final byte[] f44386c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f44385b = str;
        this.f44386c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f44385b, mVar.f44385b) && Arrays.equals(this.f44386c, mVar.f44386c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f44385b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f44386c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f44378a + ": owner=" + this.f44385b;
    }
}
