package y3;

import android.text.TextUtils;

public final class s {

    public final String f49542a;

    public final boolean f49543b;

    public final boolean f49544c;

    public s(String str, boolean z10, boolean z11) {
        this.f49542a = str;
        this.f49543b = z10;
        this.f49544c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != s.class) {
            return false;
        }
        s sVar = (s) obj;
        return TextUtils.equals(this.f49542a, sVar.f49542a) && this.f49543b == sVar.f49543b && this.f49544c == sVar.f49544c;
    }

    public final int hashCode() {
        return ((i0.a.g(31, 31, this.f49542a) + (this.f49543b ? 1231 : 1237)) * 31) + (this.f49544c ? 1231 : 1237);
    }
}
