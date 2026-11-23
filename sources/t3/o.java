package t3;

import com.google.android.gms.internal.vision.e2;
import j$.util.Objects;
public final class o extends i {
    public final String f57707b;
    public final String f57708c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f57707b = str2;
        this.f57708c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f57695a.equals(oVar.f57695a) && Objects.equals(this.f57707b, oVar.f57707b) && Objects.equals(this.f57708c, oVar.f57708c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = e2.h(527, 31, this.f57695a);
        int i10 = 0;
        String str = this.f57707b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (h + i7) * 31;
        String str2 = this.f57708c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override
    public final String toString() {
        return this.f57695a + ": url=" + this.f57708c;
    }
}
