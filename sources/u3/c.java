package u3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f49499a;
    public final long f49500b;
    public final long f49501c;

    public c(long j10, long j11, long j12) {
        this.f49499a = j10;
        this.f49500b = j11;
        this.f49501c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f49499a, ((c) obj).f49499a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f49499a == cVar.f49499a && this.f49500b == cVar.f49500b && this.f49501c == cVar.f49501c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f49499a), Long.valueOf(this.f49500b), Long.valueOf(this.f49501c));
    }
}
