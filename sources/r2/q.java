package r2;

import android.text.TextUtils;
public final class q {
    public final int f54378a;
    public final int f54379b;
    public final String f54380c;
    public final String d;
    public final String f54381e;
    public final String f54382f;

    public q(int i7, String str, int i10, String str2, String str3, String str4) {
        this.f54378a = i7;
        this.f54379b = i10;
        this.f54380c = str;
        this.d = str2;
        this.f54381e = str3;
        this.f54382f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f54378a == qVar.f54378a && this.f54379b == qVar.f54379b && TextUtils.equals(this.f54380c, qVar.f54380c) && TextUtils.equals(this.d, qVar.d) && TextUtils.equals(this.f54381e, qVar.f54381e) && TextUtils.equals(this.f54382f, qVar.f54382f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11;
        int i12 = ((this.f54378a * 31) + this.f54379b) * 31;
        int i13 = 0;
        String str = this.f54380c;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i14 = (i12 + i7) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str3 = this.f54381e;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f54382f;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }
}
