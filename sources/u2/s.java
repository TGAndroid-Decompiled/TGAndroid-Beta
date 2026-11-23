package u2;

import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
public final class s {
    public final String f58427a;
    public final boolean f58428b;
    public final boolean f58429c;

    public s(String str, boolean z10, boolean z11) {
        this.f58427a = str;
        this.f58428b = z10;
        this.f58429c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f58427a, sVar.f58427a) && this.f58428b == sVar.f58428b && this.f58429c == sVar.f58429c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = e2.h(31, 31, this.f58427a);
        int i10 = 1237;
        if (this.f58428b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (h + i7) * 31;
        if (this.f58429c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
