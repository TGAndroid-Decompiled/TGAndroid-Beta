package org.telegram.ui;

import j$.util.Objects;
public final class ut {
    public String f42549a;
    public String f42550b;
    public String f42551c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ut.class == obj.getClass()) {
            ut utVar = (ut) obj;
            if (Objects.equals(this.f42549a, utVar.f42549a) && Objects.equals(this.f42551c, utVar.f42551c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42549a, this.f42551c);
    }
}
