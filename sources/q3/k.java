package q3;

import j$.util.Objects;
public final class k extends i {
    public final String f43028b;
    public final String f43029c;
    public final String d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f43028b = str;
        this.f43029c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f43029c, kVar.f43029c) && Objects.equals(this.f43028b, kVar.f43028b) && Objects.equals(this.d, kVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f43028b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f43029c;
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
        return this.f43026a + ": domain=" + this.f43028b + ", description=" + this.f43029c;
    }
}
