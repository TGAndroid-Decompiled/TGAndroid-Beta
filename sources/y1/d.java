package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f46553a;
    public final int f46554b;
    public final int f46555c;

    public d(String str, int i10, int i11) {
        this.f46553a = str;
        this.f46554b = i10;
        this.f46555c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f46555c;
        String str = dVar.f46553a;
        int i11 = dVar.f46554b;
        int i12 = this.f46555c;
        String str2 = this.f46553a;
        int i13 = this.f46554b;
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
        return Objects.hash(this.f46553a, Integer.valueOf(this.f46555c));
    }
}
