package ri;

import j$.util.Objects;
public final class r {
    public final boolean f56758a;
    public final boolean f56759b;

    public r(boolean z10, boolean z11) {
        this.f56758a = z10;
        this.f56759b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f56758a == rVar.f56758a && this.f56759b == rVar.f56759b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f56758a), Boolean.valueOf(this.f56759b));
    }
}
