package y3;

import android.text.TextUtils;
import j3.r0;
public final class s {
    public final String f49552a;
    public final boolean f49553b;
    public final boolean f49554c;

    public s(String str, boolean z10, boolean z11) {
        this.f49552a = str;
        this.f49553b = z10;
        this.f49554c = z11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && obj.getClass() == s.class) {
                s sVar = (s) obj;
                if (TextUtils.equals(this.f49552a, sVar.f49552a) && this.f49553b == sVar.f49553b && this.f49554c == sVar.f49554c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int f10 = r0.f(31, 31, this.f49552a);
        int i10 = 1237;
        if (this.f49553b) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i11 = (f10 + i9) * 31;
        if (this.f49554c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
