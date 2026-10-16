package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f43033b;
    public final byte[] f43034c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f43033b = str;
        this.f43034c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f43033b, mVar.f43033b) && Arrays.equals(this.f43034c, mVar.f43034c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f43033b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f43034c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f43026a + ": owner=" + this.f43033b;
    }
}
