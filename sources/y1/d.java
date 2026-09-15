package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f46251a;
    public final int f46252b;
    public final int f46253c;

    public d(String str, int i10, int i11) {
        this.f46251a = str;
        this.f46252b = i10;
        this.f46253c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f46253c;
        String str = dVar.f46251a;
        int i11 = dVar.f46252b;
        int i12 = this.f46253c;
        String str2 = this.f46251a;
        int i13 = this.f46252b;
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
        return Objects.hash(this.f46251a, Integer.valueOf(this.f46253c));
    }
}
