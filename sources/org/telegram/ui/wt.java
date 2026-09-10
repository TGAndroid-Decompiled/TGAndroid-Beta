package org.telegram.ui;

import j$.util.Objects;
public final class wt {
    public String f38386a;
    public String f38387b;
    public String f38388c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wt.class == obj.getClass()) {
            wt wtVar = (wt) obj;
            if (Objects.equals(this.f38386a, wtVar.f38386a) && Objects.equals(this.f38388c, wtVar.f38388c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38386a, this.f38388c);
    }
}
