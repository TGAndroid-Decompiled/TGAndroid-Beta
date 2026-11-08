package t3;

import j$.util.Objects;
public final class e extends i {
    public final String f55395b;
    public final String f55396c;
    public final String d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f55395b = str;
        this.f55396c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f55396c, eVar.f55396c) && Objects.equals(this.f55395b, eVar.f55395b) && Objects.equals(this.d, eVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = 0;
        String str = this.f55395b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (527 + i7) * 31;
        String str2 = this.f55396c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    @Override
    public final String toString() {
        return this.f55402a + ": language=" + this.f55395b + ", description=" + this.f55396c + ", text=" + this.d;
    }
}
