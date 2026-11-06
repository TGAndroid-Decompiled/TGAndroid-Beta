package t3;

import j$.util.Objects;
public final class o extends i {
    public final String f55323b;
    public final String f55324c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f55323b = str2;
        this.f55324c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f55311a.equals(oVar.f55311a) && Objects.equals(this.f55323b, oVar.f55323b) && Objects.equals(this.f55324c, oVar.f55324c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = com.google.android.recaptcha.internal.a.h(527, 31, this.f55311a);
        int i10 = 0;
        String str = this.f55323b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (h + i7) * 31;
        String str2 = this.f55324c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override
    public final String toString() {
        return this.f55311a + ": url=" + this.f55324c;
    }
}
