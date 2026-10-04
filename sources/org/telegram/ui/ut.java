package org.telegram.ui;

import j$.util.Objects;
public final class ut {
    public String f41305a;
    public String f41306b;
    public String f41307c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ut.class == obj.getClass()) {
            ut utVar = (ut) obj;
            if (Objects.equals(this.f41305a, utVar.f41305a) && Objects.equals(this.f41307c, utVar.f41307c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f41305a, this.f41307c);
    }
}
