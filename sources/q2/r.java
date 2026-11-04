package q2;

import android.text.TextUtils;
public final class r {
    public final int f53767a;
    public final int f53768b;
    public final String f53769c;
    public final String d;
    public final String f53770e;
    public final String f53771f;

    public r(int i3, String str, int i10, String str2, String str3, String str4) {
        this.f53767a = i3;
        this.f53768b = i10;
        this.f53769c = str;
        this.d = str2;
        this.f53770e = str3;
        this.f53771f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f53767a == rVar.f53767a && this.f53768b == rVar.f53768b && TextUtils.equals(this.f53769c, rVar.f53769c) && TextUtils.equals(this.d, rVar.d) && TextUtils.equals(this.f53770e, rVar.f53770e) && TextUtils.equals(this.f53771f, rVar.f53771f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i10;
        int i11;
        int i12 = ((this.f53767a * 31) + this.f53768b) * 31;
        int i13 = 0;
        String str = this.f53769c;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i12 + i3) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str3 = this.f53770e;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f53771f;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }
}
