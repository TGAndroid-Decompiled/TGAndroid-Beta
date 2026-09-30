package org.telegram.ui;

import j$.util.Objects;
public final class qt {
    public String f37082a;
    public String f37083b;
    public String f37084c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qt.class == obj.getClass()) {
            qt qtVar = (qt) obj;
            if (Objects.equals(this.f37082a, qtVar.f37082a) && Objects.equals(this.f37084c, qtVar.f37084c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f37082a, this.f37084c);
    }
}
