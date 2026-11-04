package pi;

import j$.util.Objects;
public final class r {
    public final boolean f53625a;
    public final boolean f53626b;

    public r(boolean z10, boolean z11) {
        this.f53625a = z10;
        this.f53626b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f53625a == rVar.f53625a && this.f53626b == rVar.f53626b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f53625a), Boolean.valueOf(this.f53626b));
    }
}
