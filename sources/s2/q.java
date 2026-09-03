package s2;
public final class q {
    public final long f46925a;
    public final long f46926b;
    public final long f46927c;

    public q(long j10, long j11, long j12) {
        this.f46925a = j10;
        this.f46926b = j11;
        this.f46927c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f46925a == qVar.f46925a && this.f46927c == qVar.f46927c && this.f46926b == qVar.f46926b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46925a;
        long j11 = this.f46926b;
        long j12 = this.f46927c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f46925a + ", samplesPerChunk=" + this.f46926b + ", sampleDescriptionIndex=" + this.f46927c + '}';
    }
}
