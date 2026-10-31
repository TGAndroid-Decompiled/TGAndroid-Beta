package q3;

import j$.util.Objects;
public final class e extends j {
    public final String f45433b;
    public final String f45434c;
    public final String d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f45433b = str;
        this.f45434c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f45434c, eVar.f45434c) && Objects.equals(this.f45433b, eVar.f45433b) && Objects.equals(this.d, eVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f45433b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f45434c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override
    public final String toString() {
        return this.f45442a + ": language=" + this.f45433b + ", description=" + this.f45434c + ", text=" + this.d;
    }
}
