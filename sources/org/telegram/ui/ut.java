package org.telegram.ui;

import j$.util.Objects;
public final class ut {
    public String f41298a;
    public String f41299b;
    public String f41300c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ut.class == obj.getClass()) {
            ut utVar = (ut) obj;
            if (Objects.equals(this.f41298a, utVar.f41298a) && Objects.equals(this.f41300c, utVar.f41300c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f41298a, this.f41300c);
    }
}
