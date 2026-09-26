package org.telegram.ui;

import j$.util.Objects;
public final class qt {
    public String f36980a;
    public String f36981b;
    public String f36982c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qt.class == obj.getClass()) {
            qt qtVar = (qt) obj;
            if (Objects.equals(this.f36980a, qtVar.f36980a) && Objects.equals(this.f36982c, qtVar.f36982c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36980a, this.f36982c);
    }
}
