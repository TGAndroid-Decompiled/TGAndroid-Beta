package org.telegram.ui;

import j$.util.Objects;
public final class st {
    public String f38435a;
    public String f38436b;
    public String f38437c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && st.class == obj.getClass()) {
            st stVar = (st) obj;
            if (Objects.equals(this.f38435a, stVar.f38435a) && Objects.equals(this.f38437c, stVar.f38437c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38435a, this.f38437c);
    }
}
