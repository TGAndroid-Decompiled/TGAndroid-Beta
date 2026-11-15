package t3;

import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class b extends i {
    public final byte[] f56980b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f56980b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f56997a.equals(bVar.f56997a) && Arrays.equals(this.f56980b, bVar.f56980b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f56980b) + e2.h(527, 31, this.f56997a);
    }
}
