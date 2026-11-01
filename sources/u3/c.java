package u3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f50095a;
    public final long f50096b;
    public final long f50097c;

    public c(long j10, long j11, long j12) {
        this.f50095a = j10;
        this.f50096b = j11;
        this.f50097c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f50095a, ((c) obj).f50095a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f50095a == cVar.f50095a && this.f50096b == cVar.f50096b && this.f50097c == cVar.f50097c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f50095a), Long.valueOf(this.f50096b), Long.valueOf(this.f50097c));
    }
}
