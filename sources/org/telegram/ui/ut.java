package org.telegram.ui;

import j$.util.Objects;
public final class ut {
    public String f42547a;
    public String f42548b;
    public String f42549c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ut.class == obj.getClass()) {
            ut utVar = (ut) obj;
            if (Objects.equals(this.f42547a, utVar.f42547a) && Objects.equals(this.f42549c, utVar.f42549c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42547a, this.f42549c);
    }
}
