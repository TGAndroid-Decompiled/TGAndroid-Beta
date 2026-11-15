package r2;

import android.text.TextUtils;
public final class r {
    public final int f55862a;
    public final int f55863b;
    public final String f55864c;
    public final String d;
    public final String f55865e;
    public final String f55866f;

    public r(int i7, String str, int i10, String str2, String str3, String str4) {
        this.f55862a = i7;
        this.f55863b = i10;
        this.f55864c = str;
        this.d = str2;
        this.f55865e = str3;
        this.f55866f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f55862a == rVar.f55862a && this.f55863b == rVar.f55863b && TextUtils.equals(this.f55864c, rVar.f55864c) && TextUtils.equals(this.d, rVar.d) && TextUtils.equals(this.f55865e, rVar.f55865e) && TextUtils.equals(this.f55866f, rVar.f55866f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11;
        int i12 = ((this.f55862a * 31) + this.f55863b) * 31;
        int i13 = 0;
        String str = this.f55864c;
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
        String str3 = this.f55865e;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f55866f;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }
}
