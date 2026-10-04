package org.telegram.ui;

import j$.util.Objects;
public final class ut {
    public String f41297a;
    public String f41298b;
    public String f41299c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ut.class == obj.getClass()) {
            ut utVar = (ut) obj;
            if (Objects.equals(this.f41297a, utVar.f41297a) && Objects.equals(this.f41299c, utVar.f41299c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f41297a, this.f41299c);
    }
}
