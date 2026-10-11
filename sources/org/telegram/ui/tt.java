package org.telegram.ui;

import j$.util.Objects;
public final class tt {
    public String f42293a;
    public String f42294b;
    public String f42295c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tt.class == obj.getClass()) {
            tt ttVar = (tt) obj;
            if (Objects.equals(this.f42293a, ttVar.f42293a) && Objects.equals(this.f42295c, ttVar.f42295c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42293a, this.f42295c);
    }
}
