package u3;

import j$.util.Objects;
public final class c implements Comparable {
    public final long f47957a;
    public final long f47958b;
    public final long f47959c;

    public c(long j10, long j11, long j12) {
        this.f47957a = j10;
        this.f47958b = j11;
        this.f47959c = j12;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f47957a, ((c) obj).f47957a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f47957a == cVar.f47957a && this.f47958b == cVar.f47958b && this.f47959c == cVar.f47959c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47957a), Long.valueOf(this.f47958b), Long.valueOf(this.f47959c));
    }
}
