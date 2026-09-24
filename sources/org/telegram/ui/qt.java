package org.telegram.ui;

import j$.util.Objects;
public final class qt {
    public String f36969a;
    public String f36970b;
    public String f36971c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qt.class == obj.getClass()) {
            qt qtVar = (qt) obj;
            if (Objects.equals(this.f36969a, qtVar.f36969a) && Objects.equals(this.f36971c, qtVar.f36971c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36969a, this.f36971c);
    }
}
