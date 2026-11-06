package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f55318b;
    public final byte[] f55319c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f55318b = str;
        this.f55319c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f55318b, mVar.f55318b) && Arrays.equals(this.f55319c, mVar.f55319c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        String str = this.f55318b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return Arrays.hashCode(this.f55319c) + ((527 + i7) * 31);
    }

    @Override
    public final String toString() {
        return this.f55310a + ": owner=" + this.f55318b;
    }
}
