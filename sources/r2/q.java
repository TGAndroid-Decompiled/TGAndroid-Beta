package r2;

import android.text.TextUtils;
public final class q {
    public final int f56559a;
    public final int f56560b;
    public final String f56561c;
    public final String d;
    public final String f56562e;
    public final String f56563f;

    public q(int i7, String str, int i10, String str2, String str3, String str4) {
        this.f56559a = i7;
        this.f56560b = i10;
        this.f56561c = str;
        this.d = str2;
        this.f56562e = str3;
        this.f56563f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f56559a == qVar.f56559a && this.f56560b == qVar.f56560b && TextUtils.equals(this.f56561c, qVar.f56561c) && TextUtils.equals(this.d, qVar.d) && TextUtils.equals(this.f56562e, qVar.f56562e) && TextUtils.equals(this.f56563f, qVar.f56563f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11;
        int i12 = ((this.f56559a * 31) + this.f56560b) * 31;
        int i13 = 0;
        String str = this.f56561c;
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
        String str3 = this.f56562e;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f56563f;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }
}
