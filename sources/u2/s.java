package u2;

import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
public final class s {
    public final String f58382a;
    public final boolean f58383b;
    public final boolean f58384c;

    public s(String str, boolean z10, boolean z11) {
        this.f58382a = str;
        this.f58383b = z10;
        this.f58384c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f58382a, sVar.f58382a) && this.f58383b == sVar.f58383b && this.f58384c == sVar.f58384c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = e2.h(31, 31, this.f58382a);
        int i10 = 1237;
        if (this.f58383b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (h + i7) * 31;
        if (this.f58384c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
