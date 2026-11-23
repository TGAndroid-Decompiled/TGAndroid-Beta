package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class m extends i {
    public final String f57624b;
    public final byte[] f57625c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f57624b = str;
        this.f57625c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f57624b, mVar.f57624b) && Arrays.equals(this.f57625c, mVar.f57625c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        String str = this.f57624b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return Arrays.hashCode(this.f57625c) + ((527 + i7) * 31);
    }

    @Override
    public final String toString() {
        return this.f57616a + ": owner=" + this.f57624b;
    }
}
