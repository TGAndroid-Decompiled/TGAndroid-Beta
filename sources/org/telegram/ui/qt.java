package org.telegram.ui;

import j$.util.Objects;
public final class qt {
    public String f36982a;
    public String f36983b;
    public String f36984c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qt.class == obj.getClass()) {
            qt qtVar = (qt) obj;
            if (Objects.equals(this.f36982a, qtVar.f36982a) && Objects.equals(this.f36984c, qtVar.f36984c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36982a, this.f36984c);
    }
}
