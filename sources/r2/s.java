package r2;

import android.text.TextUtils;
public final class s {
    public final String f41222a;
    public final boolean f41223b;
    public final boolean f41224c;

    public s(String str, boolean z10, boolean z11) {
        this.f41222a = str;
        this.f41223b = z10;
        this.f41224c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f41222a, sVar.f41222a) && this.f41223b == sVar.f41223b && this.f41224c == sVar.f41224c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f41222a);
        int i11 = 1237;
        if (this.f41223b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f41224c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
