package org.telegram.ui;

import j$.util.Objects;
public final class vt {
    public String f38680a;
    public String f38681b;
    public String f38682c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vt.class == obj.getClass()) {
            vt vtVar = (vt) obj;
            if (Objects.equals(this.f38680a, vtVar.f38680a) && Objects.equals(this.f38682c, vtVar.f38682c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38680a, this.f38682c);
    }
}
