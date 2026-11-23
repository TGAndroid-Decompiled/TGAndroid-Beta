package r2;

import android.text.TextUtils;
public final class q {
    public final int f56446a;
    public final int f56447b;
    public final String f56448c;
    public final String d;
    public final String f56449e;
    public final String f56450f;

    public q(int i7, String str, int i10, String str2, String str3, String str4) {
        this.f56446a = i7;
        this.f56447b = i10;
        this.f56448c = str;
        this.d = str2;
        this.f56449e = str3;
        this.f56450f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f56446a == qVar.f56446a && this.f56447b == qVar.f56447b && TextUtils.equals(this.f56448c, qVar.f56448c) && TextUtils.equals(this.d, qVar.d) && TextUtils.equals(this.f56449e, qVar.f56449e) && TextUtils.equals(this.f56450f, qVar.f56450f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11;
        int i12 = ((this.f56446a * 31) + this.f56447b) * 31;
        int i13 = 0;
        String str = this.f56448c;
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
        String str3 = this.f56449e;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f56450f;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }
}
