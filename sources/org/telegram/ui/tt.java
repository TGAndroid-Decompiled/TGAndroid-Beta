package org.telegram.ui;

import j$.util.Objects;
public final class tt {
    public String f41703a;
    public String f41704b;
    public String f41705c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tt.class == obj.getClass()) {
            tt ttVar = (tt) obj;
            if (Objects.equals(this.f41703a, ttVar.f41703a) && Objects.equals(this.f41705c, ttVar.f41705c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f41703a, this.f41705c);
    }
}
