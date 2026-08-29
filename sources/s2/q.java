package s2;
public final class q {
    public final long f47526a;
    public final long f47527b;
    public final long f47528c;

    public q(long j10, long j11, long j12) {
        this.f47526a = j10;
        this.f47527b = j11;
        this.f47528c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f47526a == qVar.f47526a && this.f47528c == qVar.f47528c && this.f47527b == qVar.f47527b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f47526a;
        long j11 = this.f47527b;
        long j12 = this.f47528c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f47526a + ", samplesPerChunk=" + this.f47527b + ", sampleDescriptionIndex=" + this.f47528c + '}';
    }
}
