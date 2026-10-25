package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f46947b;
    public final byte[] f46948c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f46947b = str;
        this.f46948c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f46947b, mVar.f46947b) && Arrays.equals(this.f46948c, mVar.f46948c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f46947b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f46948c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f46940a + ": owner=" + this.f46947b;
    }
}
