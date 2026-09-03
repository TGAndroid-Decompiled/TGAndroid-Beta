package s2;
public final class q {
    public final long f44005a;
    public final long f44006b;
    public final long f44007c;

    public q(long j10, long j11, long j12) {
        this.f44005a = j10;
        this.f44006b = j11;
        this.f44007c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f44005a == qVar.f44005a && this.f44007c == qVar.f44007c && this.f44006b == qVar.f44006b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f44005a;
        long j11 = this.f44006b;
        long j12 = this.f44007c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f44005a + ", samplesPerChunk=" + this.f44006b + ", sampleDescriptionIndex=" + this.f44007c + '}';
    }
}
