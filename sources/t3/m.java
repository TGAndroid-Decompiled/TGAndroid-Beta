package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f57589b;
    public final byte[] f57590c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f57589b = str;
        this.f57590c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f57589b, mVar.f57589b) && Arrays.equals(this.f57590c, mVar.f57590c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        String str = this.f57589b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return Arrays.hashCode(this.f57590c) + ((527 + i7) * 31);
    }

    @Override
    public final String toString() {
        return this.f57581a + ": owner=" + this.f57589b;
    }
}
