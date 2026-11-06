package u2;

import android.text.TextUtils;
public final class s {
    public final String f56190a;
    public final boolean f56191b;
    public final boolean f56192c;

    public s(String str, boolean z9, boolean z10) {
        this.f56190a = str;
        this.f56191b = z9;
        this.f56192c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f56190a, sVar.f56190a) && this.f56191b == sVar.f56191b && this.f56192c == sVar.f56192c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = com.google.android.recaptcha.internal.a.h(31, 31, this.f56190a);
        int i10 = 1237;
        if (this.f56191b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (h + i7) * 31;
        if (this.f56192c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
