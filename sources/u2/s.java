package u2;

import android.text.TextUtils;
public final class s {
    public final String f56304a;
    public final boolean f56305b;
    public final boolean f56306c;

    public s(String str, boolean z9, boolean z10) {
        this.f56304a = str;
        this.f56305b = z9;
        this.f56306c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f56304a, sVar.f56304a) && this.f56305b == sVar.f56305b && this.f56306c == sVar.f56306c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = com.google.android.recaptcha.internal.a.h(31, 31, this.f56304a);
        int i10 = 1237;
        if (this.f56305b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (h + i7) * 31;
        if (this.f56306c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
