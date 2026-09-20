package s5;
public final class a {
    public static final a f43143f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f43144a;
    public final int f43145b;
    public final int f43146c;
    public final long d;
    public final int e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f43144a = j3;
        this.f43145b = i10;
        this.f43146c = i11;
        this.d = j10;
        this.e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f43144a == aVar.f43144a && this.f43145b == aVar.f43145b && this.f43146c == aVar.f43146c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f43144a;
        long j10 = this.d;
        return this.e ^ ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f43145b) * 1000003) ^ this.f43146c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f43144a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f43145b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f43146c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a4.a.n(this.e, "}", sb2);
    }
}
