package org.telegram.ui;

import j$.util.Objects;
public final class xt {
    public String f44161a;
    public String f44162b;
    public String f44163c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xt.class == obj.getClass()) {
            xt xtVar = (xt) obj;
            if (Objects.equals(this.f44161a, xtVar.f44161a) && Objects.equals(this.f44163c, xtVar.f44163c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44161a, this.f44163c);
    }
}
