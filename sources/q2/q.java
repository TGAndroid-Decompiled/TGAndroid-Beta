package q2;
public final class q {
    public final long f45955a;
    public final long f45956b;
    public final long f45957c;

    public q(long j10, long j11, long j12) {
        this.f45955a = j10;
        this.f45956b = j11;
        this.f45957c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f45955a == qVar.f45955a && this.f45957c == qVar.f45957c && this.f45956b == qVar.f45956b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45955a;
        long j11 = this.f45956b;
        long j12 = this.f45957c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f45955a + ", samplesPerChunk=" + this.f45956b + ", sampleDescriptionIndex=" + this.f45957c + '}';
    }
}
