package org.telegram.ui;

import j$.util.Objects;
public final class vt {
    public String f38617a;
    public String f38618b;
    public String f38619c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vt.class == obj.getClass()) {
            vt vtVar = (vt) obj;
            if (Objects.equals(this.f38617a, vtVar.f38617a) && Objects.equals(this.f38619c, vtVar.f38619c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38617a, this.f38619c);
    }
}
