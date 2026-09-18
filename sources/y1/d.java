package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f46506a;
    public final int f46507b;
    public final int f46508c;

    public d(String str, int i10, int i11) {
        this.f46506a = str;
        this.f46507b = i10;
        this.f46508c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f46508c;
        String str = dVar.f46506a;
        int i11 = dVar.f46507b;
        int i12 = this.f46508c;
        String str2 = this.f46506a;
        int i13 = this.f46507b;
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
        return Objects.hash(this.f46506a, Integer.valueOf(this.f46508c));
    }
}
