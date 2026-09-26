package s5;
public final class a {
    public static final a f43128f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f43129a;
    public final int f43130b;
    public final int f43131c;
    public final long d;
    public final int e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f43129a = j3;
        this.f43130b = i10;
        this.f43131c = i11;
        this.d = j10;
        this.e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f43129a == aVar.f43129a && this.f43130b == aVar.f43130b && this.f43131c == aVar.f43131c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f43129a;
        long j10 = this.d;
        return this.e ^ ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f43130b) * 1000003) ^ this.f43131c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f43129a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f43130b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f43131c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a4.a.o(this.e, "}", sb2);
    }
}
