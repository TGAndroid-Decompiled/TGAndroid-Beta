package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f49906a;
    public final int f49907b;
    public final int f49908c;

    public d(String str, int i10, int i11) {
        this.f49906a = str;
        this.f49907b = i10;
        this.f49908c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f49908c;
        String str = dVar.f49906a;
        int i11 = dVar.f49907b;
        int i12 = this.f49908c;
        String str2 = this.f49906a;
        int i13 = this.f49907b;
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
        return Objects.hash(this.f49906a, Integer.valueOf(this.f49908c));
    }
}
