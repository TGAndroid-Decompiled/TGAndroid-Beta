package t3;

import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class b extends i {
    public final byte[] f57599b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f57599b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f57616a.equals(bVar.f57616a) && Arrays.equals(this.f57599b, bVar.f57599b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f57599b) + e2.h(527, 31, this.f57616a);
    }
}
