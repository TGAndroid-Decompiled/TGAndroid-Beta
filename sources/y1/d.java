package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f50370a;
    public final int f50371b;
    public final int f50372c;

    public d(String str, int i10, int i11) {
        this.f50370a = str;
        this.f50371b = i10;
        this.f50372c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f50372c;
        String str = dVar.f50370a;
        int i11 = dVar.f50371b;
        int i12 = this.f50372c;
        String str2 = this.f50370a;
        int i13 = this.f50371b;
        if (i13 >= 0 && i11 >= 0) {
            if (TextUtils.equals(str2, str) && i13 == i11 && i12 == i10) {
                return true;
            }
            return false;
        } else if (TextUtils.equals(str2, str) && i12 == i10) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f50370a, Integer.valueOf(this.f50372c));
    }
}
