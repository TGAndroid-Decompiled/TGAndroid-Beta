package u3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f50081a;
    public final long f50082b;
    public final long f50083c;

    public c(long j10, long j11, long j12) {
        this.f50081a = j10;
        this.f50082b = j11;
        this.f50083c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f50081a, ((c) obj).f50081a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f50081a == cVar.f50081a && this.f50082b == cVar.f50082b && this.f50083c == cVar.f50083c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f50081a), Long.valueOf(this.f50082b), Long.valueOf(this.f50083c));
    }
}
