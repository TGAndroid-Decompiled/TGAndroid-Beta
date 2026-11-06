package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f58451a;
    public final long f58452b;
    public final long f58453c;

    public c(long j3, long j10, long j11) {
        this.f58451a = j3;
        this.f58452b = j10;
        this.f58453c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f58451a, ((c) obj).f58451a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f58451a == cVar.f58451a && this.f58452b == cVar.f58452b && this.f58453c == cVar.f58453c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f58451a), Long.valueOf(this.f58452b), Long.valueOf(this.f58453c));
    }
}
