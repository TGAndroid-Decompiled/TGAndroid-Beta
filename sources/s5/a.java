package s5;
public final class a {
    public static final a f46519f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f46520a;
    public final int f46521b;
    public final int f46522c;
    public final long d;
    public final int e;

    public a(int i10, long j10, long j11, int i11, int i12) {
        this.f46520a = j10;
        this.f46521b = i10;
        this.f46522c = i11;
        this.d = j11;
        this.e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46520a == aVar.f46520a && this.f46521b == aVar.f46521b && this.f46522c == aVar.f46522c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46520a;
        long j11 = this.d;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f46521b) * 1000003) ^ this.f46522c) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f46520a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f46521b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f46522c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a1.g.n(this.e, "}", sb2);
    }
}
