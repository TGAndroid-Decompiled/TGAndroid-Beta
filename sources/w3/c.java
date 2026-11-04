package w3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f57303a;
    public final long f57304b;
    public final long f57305c;

    public c(long j10, long j11, long j12) {
        this.f57303a = j10;
        this.f57304b = j11;
        this.f57305c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f57303a, ((c) obj).f57303a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f57303a == cVar.f57303a && this.f57304b == cVar.f57304b && this.f57305c == cVar.f57305c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f57303a), Long.valueOf(this.f57304b), Long.valueOf(this.f57305c));
    }
}
