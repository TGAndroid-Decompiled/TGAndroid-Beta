package t3;

import java.util.Arrays;
public final class b extends i {
    public final byte[] f55398b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f55398b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f55415a.equals(bVar.f55415a) && Arrays.equals(this.f55398b, bVar.f55398b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f55398b) + com.google.android.recaptcha.internal.a.h(527, 31, this.f55415a);
    }
}
