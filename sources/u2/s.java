package u2;

import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
public final class s {
    public final String f57814a;
    public final boolean f57815b;
    public final boolean f57816c;

    public s(String str, boolean z10, boolean z11) {
        this.f57814a = str;
        this.f57815b = z10;
        this.f57816c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f57814a, sVar.f57814a) && this.f57815b == sVar.f57815b && this.f57816c == sVar.f57816c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = e2.h(31, 31, this.f57814a);
        int i10 = 1237;
        if (this.f57815b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (h + i7) * 31;
        if (this.f57816c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
