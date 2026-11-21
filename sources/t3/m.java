package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f57620b;
    public final byte[] f57621c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f57620b = str;
        this.f57621c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f57620b, mVar.f57620b) && Arrays.equals(this.f57621c, mVar.f57621c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        String str = this.f57620b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return Arrays.hashCode(this.f57621c) + ((527 + i7) * 31);
    }

    @Override
    public final String toString() {
        return this.f57612a + ": owner=" + this.f57620b;
    }
}
