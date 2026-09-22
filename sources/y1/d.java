package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f46574a;
    public final int f46575b;
    public final int f46576c;

    public d(String str, int i10, int i11) {
        this.f46574a = str;
        this.f46575b = i10;
        this.f46576c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f46576c;
        String str = dVar.f46574a;
        int i11 = dVar.f46575b;
        int i12 = this.f46576c;
        String str2 = this.f46574a;
        int i13 = this.f46575b;
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
        return Objects.hash(this.f46574a, Integer.valueOf(this.f46576c));
    }
}
