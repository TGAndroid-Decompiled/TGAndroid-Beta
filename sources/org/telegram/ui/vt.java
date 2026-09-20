package org.telegram.ui;

import j$.util.Objects;
public final class vt {
    public String f38597a;
    public String f38598b;
    public String f38599c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vt.class == obj.getClass()) {
            vt vtVar = (vt) obj;
            if (Objects.equals(this.f38597a, vtVar.f38597a) && Objects.equals(this.f38599c, vtVar.f38599c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38597a, this.f38599c);
    }
}
