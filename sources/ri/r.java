package ri;

import j$.util.Objects;
public final class r {
    public final boolean f56840a;
    public final boolean f56841b;

    public r(boolean z10, boolean z11) {
        this.f56840a = z10;
        this.f56841b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f56840a == rVar.f56840a && this.f56841b == rVar.f56841b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f56840a), Boolean.valueOf(this.f56841b));
    }
}
