package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f44374b;
    public final byte[] f44375c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f44374b = str;
        this.f44375c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f44374b, mVar.f44374b) && Arrays.equals(this.f44375c, mVar.f44375c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f44374b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f44375c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f44367a + ": owner=" + this.f44374b;
    }
}
