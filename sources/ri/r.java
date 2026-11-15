package ri;

import j$.util.Objects;
public final class r {
    public final boolean f56143a;
    public final boolean f56144b;

    public r(boolean z10, boolean z11) {
        this.f56143a = z10;
        this.f56144b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f56143a == rVar.f56143a && this.f56144b == rVar.f56144b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f56143a), Boolean.valueOf(this.f56144b));
    }
}
