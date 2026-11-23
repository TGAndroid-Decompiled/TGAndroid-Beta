package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f57703b;
    public final byte[] f57704c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f57703b = str;
        this.f57704c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f57703b, mVar.f57703b) && Arrays.equals(this.f57704c, mVar.f57704c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        String str = this.f57703b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return Arrays.hashCode(this.f57704c) + ((527 + i7) * 31);
    }

    @Override
    public final String toString() {
        return this.f57695a + ": owner=" + this.f57703b;
    }
}
