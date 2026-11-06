package u2;

import android.text.TextUtils;
public final class s {
    public final String f56214a;
    public final boolean f56215b;
    public final boolean f56216c;

    public s(String str, boolean z9, boolean z10) {
        this.f56214a = str;
        this.f56215b = z9;
        this.f56216c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f56214a, sVar.f56214a) && this.f56215b == sVar.f56215b && this.f56216c == sVar.f56216c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = com.google.android.recaptcha.internal.a.h(31, 31, this.f56214a);
        int i10 = 1237;
        if (this.f56215b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (h + i7) * 31;
        if (this.f56216c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
