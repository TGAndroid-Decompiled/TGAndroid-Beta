package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f49894a;
    public final int f49895b;
    public final int f49896c;

    public d(String str, int i10, int i11) {
        this.f49894a = str;
        this.f49895b = i10;
        this.f49896c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f49896c;
        String str = dVar.f49894a;
        int i11 = dVar.f49895b;
        int i12 = this.f49896c;
        String str2 = this.f49894a;
        int i13 = this.f49895b;
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
        return Objects.hash(this.f49894a, Integer.valueOf(this.f49896c));
    }
}
