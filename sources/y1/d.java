package y1;

import android.text.TextUtils;
import j$.util.Objects;

public class d {

    public final String f49447a;

    public final int f49448b;

    public final int f49449c;

    public d(String str, int i10, int i11) {
        this.f49447a = str;
        this.f49448b = i10;
        this.f49449c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f49449c;
        String str = dVar.f49447a;
        int i11 = dVar.f49448b;
        int i12 = this.f49449c;
        String str2 = this.f49447a;
        int i13 = this.f49448b;
        if (i13 < 0 || i11 < 0) {
            return TextUtils.equals(str2, str) && i12 == i10;
        }
        return TextUtils.equals(str2, str) && i13 == i11 && i12 == i10;
    }

    public final int hashCode() {
        return Objects.hash(this.f49447a, Integer.valueOf(this.f49449c));
    }
}
