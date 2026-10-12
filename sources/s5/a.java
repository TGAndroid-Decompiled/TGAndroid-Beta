package s5;
public final class a {
    public static final a f45014f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f45015a;
    public final int f45016b;
    public final int f45017c;
    public final long d;
    public final int e;

    public a(int i10, long j10, long j11, int i11, int i12) {
        this.f45015a = j10;
        this.f45016b = i10;
        this.f45017c = i11;
        this.d = j11;
        this.e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45015a == aVar.f45015a && this.f45016b == aVar.f45016b && this.f45017c == aVar.f45017c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45015a;
        long j11 = this.d;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f45016b) * 1000003) ^ this.f45017c) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f45015a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f45016b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f45017c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a1.g.n(this.e, "}", sb2);
    }
}
