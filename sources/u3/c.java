package u3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f47514a;
    public final long f47515b;
    public final long f47516c;

    public c(long j10, long j11, long j12) {
        this.f47514a = j10;
        this.f47515b = j11;
        this.f47516c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f47514a, ((c) obj).f47514a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f47514a == cVar.f47514a && this.f47515b == cVar.f47515b && this.f47516c == cVar.f47516c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47514a), Long.valueOf(this.f47515b), Long.valueOf(this.f47516c));
    }
}
