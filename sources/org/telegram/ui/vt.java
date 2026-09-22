package org.telegram.ui;

import j$.util.Objects;
public final class vt {
    public String f38616a;
    public String f38617b;
    public String f38618c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vt.class == obj.getClass()) {
            vt vtVar = (vt) obj;
            if (Objects.equals(this.f38616a, vtVar.f38616a) && Objects.equals(this.f38618c, vtVar.f38618c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38616a, this.f38618c);
    }
}
