package t2;

import android.text.TextUtils;
public final class s {
    public final String f54896a;
    public final boolean f54897b;
    public final boolean f54898c;

    public s(String str, boolean z10, boolean z11) {
        this.f54896a = str;
        this.f54897b = z10;
        this.f54898c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f54896a, sVar.f54896a) && this.f54897b == sVar.f54897b && this.f54898c == sVar.f54898c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int g7 = com.google.android.recaptcha.internal.a.g(31, 31, this.f54896a);
        int i10 = 1237;
        if (this.f54897b) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        int i11 = (g7 + i3) * 31;
        if (this.f54898c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
