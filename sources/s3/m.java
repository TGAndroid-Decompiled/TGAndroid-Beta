package s3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f54632b;
    public final byte[] f54633c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f54632b = str;
        this.f54633c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f54632b, mVar.f54632b) && Arrays.equals(this.f54633c, mVar.f54633c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        String str = this.f54632b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        return Arrays.hashCode(this.f54633c) + ((527 + i3) * 31);
    }

    @Override
    public final String toString() {
        return this.f54624a + ": owner=" + this.f54632b;
    }
}
