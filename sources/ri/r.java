package ri;

import j$.util.Objects;
public final class r {
    public final boolean f56717a;
    public final boolean f56718b;

    public r(boolean z10, boolean z11) {
        this.f56717a = z10;
        this.f56718b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f56717a == rVar.f56717a && this.f56718b == rVar.f56718b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f56717a), Boolean.valueOf(this.f56718b));
    }
}
