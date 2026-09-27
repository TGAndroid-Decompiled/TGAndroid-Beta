package org.telegram.ui;

import j$.util.Objects;
public final class tt {
    public String f37908a;
    public String f37909b;
    public String f37910c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tt.class == obj.getClass()) {
            tt ttVar = (tt) obj;
            if (Objects.equals(this.f37908a, ttVar.f37908a) && Objects.equals(this.f37910c, ttVar.f37910c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f37908a, this.f37910c);
    }
}
