package s2;
public final class q {
    public final long f46894a;
    public final long f46895b;
    public final long f46896c;

    public q(long j10, long j11, long j12) {
        this.f46894a = j10;
        this.f46895b = j11;
        this.f46896c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f46894a == qVar.f46894a && this.f46896c == qVar.f46896c && this.f46895b == qVar.f46895b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46894a;
        long j11 = this.f46895b;
        long j12 = this.f46896c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f46894a + ", samplesPerChunk=" + this.f46895b + ", sampleDescriptionIndex=" + this.f46896c + '}';
    }
}
