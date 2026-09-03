package org.telegram.ui;

import j$.util.Objects;
public final class ut {
    public String f38913a;
    public String f38914b;
    public String f38915c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ut.class == obj.getClass()) {
            ut utVar = (ut) obj;
            if (Objects.equals(this.f38913a, utVar.f38913a) && Objects.equals(this.f38915c, utVar.f38915c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38913a, this.f38915c);
    }
}
