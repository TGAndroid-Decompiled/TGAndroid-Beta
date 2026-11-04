package zc;

import java.util.Map;
public final class a implements Map.Entry, Cloneable {
    public String f60374a;
    public String f60375b;
    public b f60376c;

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            String str = aVar.f60374a;
            String str2 = this.f60374a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f60375b;
            String str4 = aVar.f60375b;
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
        return this.f60374a;
    }

    @Override
    public final Object getValue() {
        return this.f60375b;
    }

    @Override
    public final int hashCode() {
        int i3;
        String str = this.f60374a;
        int i10 = 0;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = i3 * 31;
        String str2 = this.f60375b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        b bVar = this.f60376c;
        String str3 = this.f60374a;
        int h = bVar.h(str3);
        String str4 = "";
        if (h != -1 && (str = bVar.f60379c[h]) != null) {
            str4 = str;
        }
        int h7 = bVar.h(str3);
        if (h7 != -1) {
            bVar.f60379c[h7] = str2;
        }
        this.f60375b = str2;
        return str4;
    }
}
