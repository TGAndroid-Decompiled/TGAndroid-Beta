package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f44799b;
    public final byte[] f44800c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f44799b = str;
        this.f44800c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f44799b, mVar.f44799b) && Arrays.equals(this.f44800c, mVar.f44800c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f44799b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f44800c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f44792a + ": owner=" + this.f44799b;
    }
}
