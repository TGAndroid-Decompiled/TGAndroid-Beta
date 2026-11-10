package t3;

import j$.util.Objects;
public final class o extends i {
    public final String f55426b;
    public final String f55427c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f55426b = str2;
        this.f55427c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f55414a.equals(oVar.f55414a) && Objects.equals(this.f55426b, oVar.f55426b) && Objects.equals(this.f55427c, oVar.f55427c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = com.google.android.recaptcha.internal.a.h(527, 31, this.f55414a);
        int i10 = 0;
        String str = this.f55426b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (h + i7) * 31;
        String str2 = this.f55427c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override
    public final String toString() {
        return this.f55414a + ": url=" + this.f55427c;
    }
}
