package t3;

import j$.util.Objects;
public final class k extends i {
    public final String f55417b;
    public final String f55418c;
    public final String d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f55417b = str;
        this.f55418c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f55418c, kVar.f55418c) && Objects.equals(this.f55417b, kVar.f55417b) && Objects.equals(this.d, kVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = 0;
        String str = this.f55417b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (527 + i7) * 31;
        String str2 = this.f55418c;
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
        return this.f55415a + ": domain=" + this.f55417b + ", description=" + this.f55418c;
    }
}
