package org.telegram.ui;

import j$.util.Objects;
public final class ut {
    public String f41340a;
    public String f41341b;
    public String f41342c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ut.class == obj.getClass()) {
            ut utVar = (ut) obj;
            if (Objects.equals(this.f41340a, utVar.f41340a) && Objects.equals(this.f41342c, utVar.f41342c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f41340a, this.f41342c);
    }
}
