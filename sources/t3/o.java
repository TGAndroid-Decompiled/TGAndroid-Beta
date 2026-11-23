package t3;

import com.google.android.gms.internal.vision.e2;
import j$.util.Objects;
public final class o extends i {
    public final String f57593b;
    public final String f57594c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f57593b = str2;
        this.f57594c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f57581a.equals(oVar.f57581a) && Objects.equals(this.f57593b, oVar.f57593b) && Objects.equals(this.f57594c, oVar.f57594c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = e2.h(527, 31, this.f57581a);
        int i10 = 0;
        String str = this.f57593b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (h + i7) * 31;
        String str2 = this.f57594c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override
    public final String toString() {
        return this.f57581a + ": url=" + this.f57594c;
    }
}
