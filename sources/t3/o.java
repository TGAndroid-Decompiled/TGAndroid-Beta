package t3;

import com.google.android.gms.internal.vision.e2;
import j$.util.Objects;
public final class o extends i {
    public final String f57628b;
    public final String f57629c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f57628b = str2;
        this.f57629c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f57616a.equals(oVar.f57616a) && Objects.equals(this.f57628b, oVar.f57628b) && Objects.equals(this.f57629c, oVar.f57629c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = e2.h(527, 31, this.f57616a);
        int i10 = 0;
        String str = this.f57628b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (h + i7) * 31;
        String str2 = this.f57629c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override
    public final String toString() {
        return this.f57616a + ": url=" + this.f57629c;
    }
}
