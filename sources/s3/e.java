package s3;

import j$.util.Objects;
public final class e extends i {
    public final String f54617b;
    public final String f54618c;
    public final String d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f54617b = str;
        this.f54618c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f54618c, eVar.f54618c) && Objects.equals(this.f54617b, eVar.f54617b) && Objects.equals(this.d, eVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i10;
        int i11 = 0;
        String str = this.f54617b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (527 + i3) * 31;
        String str2 = this.f54618c;
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
        return this.f54624a + ": language=" + this.f54617b + ", description=" + this.f54618c + ", text=" + this.d;
    }
}
