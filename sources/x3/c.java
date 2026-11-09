package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f58556a;
    public final long f58557b;
    public final long f58558c;

    public c(long j3, long j10, long j11) {
        this.f58556a = j3;
        this.f58557b = j10;
        this.f58558c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f58556a, ((c) obj).f58556a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f58556a == cVar.f58556a && this.f58557b == cVar.f58557b && this.f58558c == cVar.f58558c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f58556a), Long.valueOf(this.f58557b), Long.valueOf(this.f58558c));
    }
}
