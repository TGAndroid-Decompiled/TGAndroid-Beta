package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f59737a;
    public final long f59738b;
    public final long f59739c;

    public c(long j3, long j10, long j11) {
        this.f59737a = j3;
        this.f59738b = j10;
        this.f59739c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f59737a, ((c) obj).f59737a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f59737a == cVar.f59737a && this.f59738b == cVar.f59738b && this.f59739c == cVar.f59739c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f59737a), Long.valueOf(this.f59738b), Long.valueOf(this.f59739c));
    }
}
