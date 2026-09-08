package s5;
public final class a {
    public static final a f45955f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f45956a;
    public final int f45957b;
    public final int f45958c;
    public final long d;
    public final int f45959e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f45956a = j3;
        this.f45957b = i10;
        this.f45958c = i11;
        this.d = j10;
        this.f45959e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45956a == aVar.f45956a && this.f45957b == aVar.f45957b && this.f45958c == aVar.f45958c && this.d == aVar.d && this.f45959e == aVar.f45959e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45956a;
        long j10 = this.d;
        return this.f45959e ^ ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f45957b) * 1000003) ^ this.f45958c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f45956a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f45957b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f45958c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a4.a.n(this.f45959e, "}", sb2);
    }
}
