package wc;

import java.util.Map;
public final class a implements Map.Entry, Cloneable {
    public String f52796a;
    public String f52797b;
    public b f52798c;

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            String str = aVar.f52796a;
            String str2 = this.f52796a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f52797b;
            String str4 = aVar.f52797b;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f52796a;
    }

    @Override
    public final Object getValue() {
        return this.f52797b;
    }

    @Override
    public final int hashCode() {
        int i10;
        String str = this.f52796a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f52797b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        b bVar = this.f52798c;
        String str3 = this.f52796a;
        int l4 = bVar.l(str3);
        String str4 = "";
        if (l4 != -1 && (str = bVar.f52801c[l4]) != null) {
            str4 = str;
        }
        int l10 = bVar.l(str3);
        if (l10 != -1) {
            bVar.f52801c[l10] = str2;
        }
        this.f52797b = str2;
        return str4;
    }
}
