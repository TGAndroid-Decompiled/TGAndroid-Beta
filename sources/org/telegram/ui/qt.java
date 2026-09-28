package org.telegram.ui;

import j$.util.Objects;
public final class qt {
    public String f36981a;
    public String f36982b;
    public String f36983c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qt.class == obj.getClass()) {
            qt qtVar = (qt) obj;
            if (Objects.equals(this.f36981a, qtVar.f36981a) && Objects.equals(this.f36983c, qtVar.f36983c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36981a, this.f36983c);
    }
}
