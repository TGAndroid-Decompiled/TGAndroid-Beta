package r2;

import android.text.TextUtils;
public final class r {
    public final int f54262a;
    public final int f54263b;
    public final String f54264c;
    public final String d;
    public final String f54265e;
    public final String f54266f;

    public r(int i7, String str, int i10, String str2, String str3, String str4) {
        this.f54262a = i7;
        this.f54263b = i10;
        this.f54264c = str;
        this.d = str2;
        this.f54265e = str3;
        this.f54266f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f54262a == rVar.f54262a && this.f54263b == rVar.f54263b && TextUtils.equals(this.f54264c, rVar.f54264c) && TextUtils.equals(this.d, rVar.d) && TextUtils.equals(this.f54265e, rVar.f54265e) && TextUtils.equals(this.f54266f, rVar.f54266f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11;
        int i12 = ((this.f54262a * 31) + this.f54263b) * 31;
        int i13 = 0;
        String str = this.f54264c;
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
        String str3 = this.f54265e;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f54266f;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }
}
