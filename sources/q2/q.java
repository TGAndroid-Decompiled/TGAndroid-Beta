package q2;

public final class q {

    public final long f46119a;

    public final long f46120b;

    public final long f46121c;

    public q(long j10, long j11, long j12) {
        this.f46119a = j10;
        this.f46120b = j11;
        this.f46121c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f46119a == qVar.f46119a && this.f46121c == qVar.f46121c && this.f46120b == qVar.f46120b;
    }

    public final int hashCode() {
        long j10 = this.f46119a;
        long j11 = this.f46120b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f46121c;
        return i10 + ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f46119a + ", samplesPerChunk=" + this.f46120b + ", sampleDescriptionIndex=" + this.f46121c + '}';
    }
}
