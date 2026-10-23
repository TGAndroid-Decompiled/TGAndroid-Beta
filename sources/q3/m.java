package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f44386b;
    public final byte[] f44387c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f44386b = str;
        this.f44387c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f44386b, mVar.f44386b) && Arrays.equals(this.f44387c, mVar.f44387c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f44386b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f44387c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f44379a + ": owner=" + this.f44386b;
    }
}
