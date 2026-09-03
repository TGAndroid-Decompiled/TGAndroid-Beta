package org.telegram.ui;

import j$.util.Objects;
public final class tt {
    public String f41631a;
    public String f41632b;
    public String f41633c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tt.class == obj.getClass()) {
            tt ttVar = (tt) obj;
            if (Objects.equals(this.f41631a, ttVar.f41631a) && Objects.equals(this.f41633c, ttVar.f41633c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f41631a, this.f41633c);
    }
}
