package u2;

import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
public final class s {
    public final String f58507a;
    public final boolean f58508b;
    public final boolean f58509c;

    public s(String str, boolean z10, boolean z11) {
        this.f58507a = str;
        this.f58508b = z10;
        this.f58509c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f58507a, sVar.f58507a) && this.f58508b == sVar.f58508b && this.f58509c == sVar.f58509c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = e2.h(31, 31, this.f58507a);
        int i10 = 1237;
        if (this.f58508b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (h + i7) * 31;
        if (this.f58509c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
