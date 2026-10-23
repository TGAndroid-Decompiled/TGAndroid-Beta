package u3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f47958a;
    public final long f47959b;
    public final long f47960c;

    public c(long j10, long j11, long j12) {
        this.f47958a = j10;
        this.f47959b = j11;
        this.f47960c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f47958a, ((c) obj).f47958a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f47958a == cVar.f47958a && this.f47959b == cVar.f47959b && this.f47960c == cVar.f47960c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47958a), Long.valueOf(this.f47959b), Long.valueOf(this.f47960c));
    }
}
