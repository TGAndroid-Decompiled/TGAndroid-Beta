package org.telegram.ui;

import j$.util.Objects;
public final class xt {
    public String f39700a;
    public String f39701b;
    public String f39702c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xt.class == obj.getClass()) {
            xt xtVar = (xt) obj;
            if (Objects.equals(this.f39700a, xtVar.f39700a) && Objects.equals(this.f39702c, xtVar.f39702c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f39700a, this.f39702c);
    }
}
