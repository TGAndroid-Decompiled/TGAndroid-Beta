package r2;

import android.text.TextUtils;
public final class q {
    public final int f54379a;
    public final int f54380b;
    public final String f54381c;
    public final String d;
    public final String f54382e;
    public final String f54383f;

    public q(int i7, String str, int i10, String str2, String str3, String str4) {
        this.f54379a = i7;
        this.f54380b = i10;
        this.f54381c = str;
        this.d = str2;
        this.f54382e = str3;
        this.f54383f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f54379a == qVar.f54379a && this.f54380b == qVar.f54380b && TextUtils.equals(this.f54381c, qVar.f54381c) && TextUtils.equals(this.d, qVar.d) && TextUtils.equals(this.f54382e, qVar.f54382e) && TextUtils.equals(this.f54383f, qVar.f54383f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11;
        int i12 = ((this.f54379a * 31) + this.f54380b) * 31;
        int i13 = 0;
        String str = this.f54381c;
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
        String str3 = this.f54382e;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f54383f;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }
}
