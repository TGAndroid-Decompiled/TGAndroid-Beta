package org.telegram.ui;

import j$.util.Objects;
public final class vt {
    public String f41720a;
    public String f41721b;
    public String f41722c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vt.class == obj.getClass()) {
            vt vtVar = (vt) obj;
            if (Objects.equals(this.f41720a, vtVar.f41720a) && Objects.equals(this.f41722c, vtVar.f41722c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f41720a, this.f41722c);
    }
}
