package s5;
public final class a {
    public static final a f42866f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f42867a;
    public final int f42868b;
    public final int f42869c;
    public final long d;
    public final int e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f42867a = j3;
        this.f42868b = i10;
        this.f42869c = i11;
        this.d = j10;
        this.e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f42867a == aVar.f42867a && this.f42868b == aVar.f42868b && this.f42869c == aVar.f42869c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42867a;
        long j10 = this.d;
        return this.e ^ ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f42868b) * 1000003) ^ this.f42869c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f42867a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f42868b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f42869c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a4.a.n(this.e, "}", sb2);
    }
}
