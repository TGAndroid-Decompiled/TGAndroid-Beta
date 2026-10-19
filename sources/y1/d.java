package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f49883a;
    public final int f49884b;
    public final int f49885c;

    public d(String str, int i10, int i11) {
        this.f49883a = str;
        this.f49884b = i10;
        this.f49885c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f49885c;
        String str = dVar.f49883a;
        int i11 = dVar.f49884b;
        int i12 = this.f49885c;
        String str2 = this.f49883a;
        int i13 = this.f49884b;
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
        return Objects.hash(this.f49883a, Integer.valueOf(this.f49885c));
    }
}
