package org.telegram.ui;

import j$.util.Objects;
public final class vt {
    public String f38618a;
    public String f38619b;
    public String f38620c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vt.class == obj.getClass()) {
            vt vtVar = (vt) obj;
            if (Objects.equals(this.f38618a, vtVar.f38618a) && Objects.equals(this.f38620c, vtVar.f38620c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38618a, this.f38620c);
    }
}
