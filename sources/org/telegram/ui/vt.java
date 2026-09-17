package org.telegram.ui;

import j$.util.Objects;
public final class vt {
    public String f41694a;
    public String f41695b;
    public String f41696c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vt.class == obj.getClass()) {
            vt vtVar = (vt) obj;
            if (Objects.equals(this.f41694a, vtVar.f41694a) && Objects.equals(this.f41696c, vtVar.f41696c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f41694a, this.f41696c);
    }
}
