package u2;

import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
public final class s {
    public final String f58423a;
    public final boolean f58424b;
    public final boolean f58425c;

    public s(String str, boolean z10, boolean z11) {
        this.f58423a = str;
        this.f58424b = z10;
        this.f58425c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f58423a, sVar.f58423a) && this.f58424b == sVar.f58424b && this.f58425c == sVar.f58425c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = e2.h(31, 31, this.f58423a);
        int i10 = 1237;
        if (this.f58424b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (h + i7) * 31;
        if (this.f58425c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
