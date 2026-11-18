package t3;

import j$.util.Objects;
public final class k extends i {
    public final String f57575b;
    public final String f57576c;
    public final String d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f57575b = str;
        this.f57576c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f57576c, kVar.f57576c) && Objects.equals(this.f57575b, kVar.f57575b) && Objects.equals(this.d, kVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = 0;
        String str = this.f57575b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (527 + i7) * 31;
        String str2 = this.f57576c;
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
        return this.f57573a + ": domain=" + this.f57575b + ", description=" + this.f57576c;
    }
}
