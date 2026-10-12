package org.telegram.ui;

import j$.util.Objects;
public final class xt {
    public String f44156a;
    public String f44157b;
    public String f44158c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xt.class == obj.getClass()) {
            xt xtVar = (xt) obj;
            if (Objects.equals(this.f44156a, xtVar.f44156a) && Objects.equals(this.f44158c, xtVar.f44158c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44156a, this.f44158c);
    }
}
