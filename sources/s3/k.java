package s3;

import j$.util.Objects;
public final class k extends i {
    public final String f54626b;
    public final String f54627c;
    public final String d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f54626b = str;
        this.f54627c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f54627c, kVar.f54627c) && Objects.equals(this.f54626b, kVar.f54626b) && Objects.equals(this.d, kVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i10;
        int i11 = 0;
        String str = this.f54626b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (527 + i3) * 31;
        String str2 = this.f54627c;
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
        return this.f54624a + ": domain=" + this.f54626b + ", description=" + this.f54627c;
    }
}
