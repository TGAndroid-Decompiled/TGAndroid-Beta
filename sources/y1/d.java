package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f49470a;
    public final int f49471b;
    public final int f49472c;

    public d(String str, int i10, int i11) {
        this.f49470a = str;
        this.f49471b = i10;
        this.f49472c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f49472c;
        String str = dVar.f49470a;
        int i11 = dVar.f49471b;
        int i12 = this.f49472c;
        String str2 = this.f49470a;
        int i13 = this.f49471b;
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
        return Objects.hash(this.f49470a, Integer.valueOf(this.f49472c));
    }
}
