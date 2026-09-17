package org.telegram.ui;

import j$.util.Objects;
public final class vt {
    public String f41721a;
    public String f41722b;
    public String f41723c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vt.class == obj.getClass()) {
            vt vtVar = (vt) obj;
            if (Objects.equals(this.f41721a, vtVar.f41721a) && Objects.equals(this.f41723c, vtVar.f41723c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f41721a, this.f41723c);
    }
}
