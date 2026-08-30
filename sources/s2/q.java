package s2;
public final class q {
    public final long f43940a;
    public final long f43941b;
    public final long f43942c;

    public q(long j10, long j11, long j12) {
        this.f43940a = j10;
        this.f43941b = j11;
        this.f43942c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f43940a == qVar.f43940a && this.f43942c == qVar.f43942c && this.f43941b == qVar.f43941b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f43940a;
        long j11 = this.f43941b;
        long j12 = this.f43942c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f43940a + ", samplesPerChunk=" + this.f43941b + ", sampleDescriptionIndex=" + this.f43942c + '}';
    }
}
