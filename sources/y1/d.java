package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f49885a;
    public final int f49886b;
    public final int f49887c;

    public d(String str, int i10, int i11) {
        this.f49885a = str;
        this.f49886b = i10;
        this.f49887c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f49887c;
        String str = dVar.f49885a;
        int i11 = dVar.f49886b;
        int i12 = this.f49887c;
        String str2 = this.f49885a;
        int i13 = this.f49886b;
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
        return Objects.hash(this.f49885a, Integer.valueOf(this.f49887c));
    }
}
