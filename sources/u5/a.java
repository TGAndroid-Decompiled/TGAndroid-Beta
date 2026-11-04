package u5;
public final class a {
    public static final a f55710f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f55711a;
    public final int f55712b;
    public final int f55713c;
    public final long d;
    public final int f55714e;

    public a(int i3, long j10, long j11, int i10, int i11) {
        this.f55711a = j10;
        this.f55712b = i3;
        this.f55713c = i10;
        this.d = j11;
        this.f55714e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f55711a == aVar.f55711a && this.f55712b == aVar.f55712b && this.f55713c == aVar.f55713c && this.d == aVar.d && this.f55714e == aVar.f55714e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f55711a;
        long j11 = this.d;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f55712b) * 1000003) ^ this.f55713c) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f55714e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f55711a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f55712b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f55713c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a1.g.o(this.f55714e, "}", sb2);
    }
}
