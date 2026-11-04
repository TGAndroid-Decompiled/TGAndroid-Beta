package s3;

import j$.util.Objects;
public final class o extends i {
    public final String f54636b;
    public final String f54637c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f54636b = str2;
        this.f54637c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f54624a.equals(oVar.f54624a) && Objects.equals(this.f54636b, oVar.f54636b) && Objects.equals(this.f54637c, oVar.f54637c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int g7 = com.google.android.recaptcha.internal.a.g(527, 31, this.f54624a);
        int i10 = 0;
        String str = this.f54636b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (g7 + i3) * 31;
        String str2 = this.f54637c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override
    public final String toString() {
        return this.f54624a + ": url=" + this.f54637c;
    }
}
