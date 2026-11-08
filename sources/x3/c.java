package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f58547a;
    public final long f58548b;
    public final long f58549c;

    public c(long j3, long j10, long j11) {
        this.f58547a = j3;
        this.f58548b = j10;
        this.f58549c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f58547a, ((c) obj).f58547a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f58547a == cVar.f58547a && this.f58548b == cVar.f58548b && this.f58549c == cVar.f58549c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f58547a), Long.valueOf(this.f58548b), Long.valueOf(this.f58549c));
    }
}
