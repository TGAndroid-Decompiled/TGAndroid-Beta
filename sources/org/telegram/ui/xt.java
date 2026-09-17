package org.telegram.ui;

import j$.util.Objects;
public final class xt {
    public String f39695a;
    public String f39696b;
    public String f39697c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xt.class == obj.getClass()) {
            xt xtVar = (xt) obj;
            if (Objects.equals(this.f39695a, xtVar.f39695a) && Objects.equals(this.f39697c, xtVar.f39697c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f39695a, this.f39697c);
    }
}
