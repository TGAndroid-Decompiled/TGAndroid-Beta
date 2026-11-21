package r2;

import android.text.TextUtils;
public final class q {
    public final int f56477a;
    public final int f56478b;
    public final String f56479c;
    public final String d;
    public final String f56480e;
    public final String f56481f;

    public q(int i7, String str, int i10, String str2, String str3, String str4) {
        this.f56477a = i7;
        this.f56478b = i10;
        this.f56479c = str;
        this.d = str2;
        this.f56480e = str3;
        this.f56481f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f56477a == qVar.f56477a && this.f56478b == qVar.f56478b && TextUtils.equals(this.f56479c, qVar.f56479c) && TextUtils.equals(this.d, qVar.d) && TextUtils.equals(this.f56480e, qVar.f56480e) && TextUtils.equals(this.f56481f, qVar.f56481f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11;
        int i12 = ((this.f56477a * 31) + this.f56478b) * 31;
        int i13 = 0;
        String str = this.f56479c;
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
        String str3 = this.f56480e;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f56481f;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }
}
