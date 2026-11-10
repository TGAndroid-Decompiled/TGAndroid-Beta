package u2;

import android.text.TextUtils;
public final class s {
    public final String f56315a;
    public final boolean f56316b;
    public final boolean f56317c;

    public s(String str, boolean z9, boolean z10) {
        this.f56315a = str;
        this.f56316b = z9;
        this.f56317c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f56315a, sVar.f56315a) && this.f56316b == sVar.f56316b && this.f56317c == sVar.f56317c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = com.google.android.recaptcha.internal.a.h(31, 31, this.f56315a);
        int i10 = 1237;
        if (this.f56316b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (h + i7) * 31;
        if (this.f56317c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
