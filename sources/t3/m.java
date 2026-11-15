package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f57005b;
    public final byte[] f57006c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f57005b = str;
        this.f57006c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f57005b, mVar.f57005b) && Arrays.equals(this.f57006c, mVar.f57006c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        String str = this.f57005b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return Arrays.hashCode(this.f57006c) + ((527 + i7) * 31);
    }

    @Override
    public final String toString() {
        return this.f56997a + ": owner=" + this.f57005b;
    }
}
