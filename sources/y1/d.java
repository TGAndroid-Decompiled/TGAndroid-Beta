package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f46532a;
    public final int f46533b;
    public final int f46534c;

    public d(String str, int i10, int i11) {
        this.f46532a = str;
        this.f46533b = i10;
        this.f46534c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f46534c;
        String str = dVar.f46532a;
        int i11 = dVar.f46533b;
        int i12 = this.f46534c;
        String str2 = this.f46532a;
        int i13 = this.f46533b;
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
        return Objects.hash(this.f46532a, Integer.valueOf(this.f46534c));
    }
}
