package r2;

import android.text.TextUtils;
public final class r {
    public final int f54286a;
    public final int f54287b;
    public final String f54288c;
    public final String d;
    public final String f54289e;
    public final String f54290f;

    public r(int i7, String str, int i10, String str2, String str3, String str4) {
        this.f54286a = i7;
        this.f54287b = i10;
        this.f54288c = str;
        this.d = str2;
        this.f54289e = str3;
        this.f54290f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f54286a == rVar.f54286a && this.f54287b == rVar.f54287b && TextUtils.equals(this.f54288c, rVar.f54288c) && TextUtils.equals(this.d, rVar.d) && TextUtils.equals(this.f54289e, rVar.f54289e) && TextUtils.equals(this.f54290f, rVar.f54290f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11;
        int i12 = ((this.f54286a * 31) + this.f54287b) * 31;
        int i13 = 0;
        String str = this.f54288c;
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
        String str3 = this.f54289e;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f54290f;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }
}
