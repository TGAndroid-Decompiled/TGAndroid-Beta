package t5;
public final class a {
    public static final a f48694f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f48695a;
    public final int f48696b;
    public final int f48697c;
    public final long d;
    public final int e;

    public a(int i10, long j10, long j11, int i11, int i12) {
        this.f48695a = j10;
        this.f48696b = i10;
        this.f48697c = i11;
        this.d = j11;
        this.e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f48695a == aVar.f48695a && this.f48696b == aVar.f48696b && this.f48697c == aVar.f48697c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f48695a;
        long j11 = this.d;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f48696b) * 1000003) ^ this.f48697c) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f48695a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f48696b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f48697c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a1.g.n(this.e, "}", sb2);
    }
}
