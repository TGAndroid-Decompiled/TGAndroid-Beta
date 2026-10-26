package u3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f49502a;
    public final long f49503b;
    public final long f49504c;

    public c(long j10, long j11, long j12) {
        this.f49502a = j10;
        this.f49503b = j11;
        this.f49504c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f49502a, ((c) obj).f49502a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f49502a == cVar.f49502a && this.f49503b == cVar.f49503b && this.f49504c == cVar.f49504c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f49502a), Long.valueOf(this.f49503b), Long.valueOf(this.f49504c));
    }
}
