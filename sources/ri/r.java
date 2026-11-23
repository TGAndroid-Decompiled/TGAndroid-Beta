package ri;

import j$.util.Objects;
public final class r {
    public final boolean f56762a;
    public final boolean f56763b;

    public r(boolean z10, boolean z11) {
        this.f56762a = z10;
        this.f56763b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f56762a == rVar.f56762a && this.f56763b == rVar.f56763b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f56762a), Boolean.valueOf(this.f56763b));
    }
}
