package s5;
public final class a {
    public static final a f48075f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f48076a;
    public final int f48077b;
    public final int f48078c;
    public final long d;
    public final int e;

    public a(int i10, long j10, long j11, int i11, int i12) {
        this.f48076a = j10;
        this.f48077b = i10;
        this.f48078c = i11;
        this.d = j11;
        this.e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f48076a == aVar.f48076a && this.f48077b == aVar.f48077b && this.f48078c == aVar.f48078c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f48076a;
        long j11 = this.d;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f48077b) * 1000003) ^ this.f48078c) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f48076a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f48077b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f48078c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a1.g.p(sb2, this.e, "}");
    }
}
