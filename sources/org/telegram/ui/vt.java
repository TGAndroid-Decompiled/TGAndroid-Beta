package org.telegram.ui;

import j$.util.Objects;
public final class vt {
    public String f41693a;
    public String f41694b;
    public String f41695c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vt.class == obj.getClass()) {
            vt vtVar = (vt) obj;
            if (Objects.equals(this.f41693a, vtVar.f41693a) && Objects.equals(this.f41695c, vtVar.f41695c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f41693a, this.f41695c);
    }
}
