package org.telegram.ui;

import j$.util.Objects;
public final class ut {
    public String f42593a;
    public String f42594b;
    public String f42595c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ut.class == obj.getClass()) {
            ut utVar = (ut) obj;
            if (Objects.equals(this.f42593a, utVar.f42593a) && Objects.equals(this.f42595c, utVar.f42595c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42593a, this.f42595c);
    }
}
