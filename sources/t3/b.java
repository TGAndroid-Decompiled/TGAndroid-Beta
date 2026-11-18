package t3;

import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class b extends i {
    public final byte[] f57556b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f57556b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f57573a.equals(bVar.f57573a) && Arrays.equals(this.f57556b, bVar.f57556b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f57556b) + e2.h(527, 31, this.f57573a);
    }
}
