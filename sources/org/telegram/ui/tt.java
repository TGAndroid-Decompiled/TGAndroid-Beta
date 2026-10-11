package org.telegram.ui;

import j$.util.Objects;
public final class tt {
    public String f42259a;
    public String f42260b;
    public String f42261c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tt.class == obj.getClass()) {
            tt ttVar = (tt) obj;
            if (Objects.equals(this.f42259a, ttVar.f42259a) && Objects.equals(this.f42261c, ttVar.f42261c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42259a, this.f42261c);
    }
}
