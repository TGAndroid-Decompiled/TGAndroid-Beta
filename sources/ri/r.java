package ri;

import j$.util.Objects;
public final class r {
    public final boolean f56727a;
    public final boolean f56728b;

    public r(boolean z10, boolean z11) {
        this.f56727a = z10;
        this.f56728b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f56727a == rVar.f56727a && this.f56728b == rVar.f56728b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f56727a), Boolean.valueOf(this.f56728b));
    }
}
