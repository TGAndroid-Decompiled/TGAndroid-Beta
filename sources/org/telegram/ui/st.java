package org.telegram.ui;

import j$.util.Objects;
public final class st {
    public String f37415a;
    public String f37416b;
    public String f37417c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && st.class == obj.getClass()) {
            st stVar = (st) obj;
            if (Objects.equals(this.f37415a, stVar.f37415a) && Objects.equals(this.f37417c, stVar.f37417c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f37415a, this.f37417c);
    }
}
