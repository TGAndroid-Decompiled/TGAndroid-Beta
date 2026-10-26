package q3;

import j$.util.Objects;
public final class k extends i {
    public final String f46945b;
    public final String f46946c;
    public final String d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f46945b = str;
        this.f46946c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f46946c, kVar.f46946c) && Objects.equals(this.f46945b, kVar.f46945b) && Objects.equals(this.d, kVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f46945b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f46946c;
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
        return this.f46943a + ": domain=" + this.f46945b + ", description=" + this.f46946c;
    }
}
