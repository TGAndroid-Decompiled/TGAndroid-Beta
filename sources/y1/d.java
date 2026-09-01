package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f50665a;
    public final int f50666b;
    public final int f50667c;

    public d(String str, int i10, int i11) {
        this.f50665a = str;
        this.f50666b = i10;
        this.f50667c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f50667c;
        String str = dVar.f50665a;
        int i11 = dVar.f50666b;
        int i12 = this.f50667c;
        String str2 = this.f50665a;
        int i13 = this.f50666b;
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
        return Objects.hash(this.f50665a, Integer.valueOf(this.f50667c));
    }
}
