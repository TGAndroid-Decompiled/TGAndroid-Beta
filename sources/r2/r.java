package r2;

import android.text.TextUtils;
public final class r {
    public final int f54287a;
    public final int f54288b;
    public final String f54289c;
    public final String d;
    public final String f54290e;
    public final String f54291f;

    public r(int i7, String str, int i10, String str2, String str3, String str4) {
        this.f54287a = i7;
        this.f54288b = i10;
        this.f54289c = str;
        this.d = str2;
        this.f54290e = str3;
        this.f54291f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f54287a == rVar.f54287a && this.f54288b == rVar.f54288b && TextUtils.equals(this.f54289c, rVar.f54289c) && TextUtils.equals(this.d, rVar.d) && TextUtils.equals(this.f54290e, rVar.f54290e) && TextUtils.equals(this.f54291f, rVar.f54291f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11;
        int i12 = ((this.f54287a * 31) + this.f54288b) * 31;
        int i13 = 0;
        String str = this.f54289c;
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
        String str3 = this.f54290e;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f54291f;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }
}
