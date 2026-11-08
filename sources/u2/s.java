package u2;

import android.text.TextUtils;
public final class s {
    public final String f56303a;
    public final boolean f56304b;
    public final boolean f56305c;

    public s(String str, boolean z9, boolean z10) {
        this.f56303a = str;
        this.f56304b = z9;
        this.f56305c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f56303a, sVar.f56303a) && this.f56304b == sVar.f56304b && this.f56305c == sVar.f56305c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = com.google.android.recaptcha.internal.a.h(31, 31, this.f56303a);
        int i10 = 1237;
        if (this.f56304b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (h + i7) * 31;
        if (this.f56305c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
