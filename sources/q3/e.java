package q3;

import j$.util.Objects;
public final class e extends j {
    public final String f41436b;
    public final String f41437c;
    public final String d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f41436b = str;
        this.f41437c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f41437c, eVar.f41437c) && Objects.equals(this.f41436b, eVar.f41436b) && Objects.equals(this.d, eVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f41436b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f41437c;
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
        return this.f41445a + ": language=" + this.f41436b + ", description=" + this.f41437c + ", text=" + this.d;
    }
}
