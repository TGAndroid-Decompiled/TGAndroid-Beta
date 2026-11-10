package x3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f58554a;
    public final long f58555b;
    public final long f58556c;

    public c(long j3, long j10, long j11) {
        this.f58554a = j3;
        this.f58555b = j10;
        this.f58556c = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f58554a, ((c) obj).f58554a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f58554a == cVar.f58554a && this.f58555b == cVar.f58555b && this.f58556c == cVar.f58556c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f58554a), Long.valueOf(this.f58555b), Long.valueOf(this.f58556c));
    }
}
