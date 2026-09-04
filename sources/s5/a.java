package s5;
public final class a {
    public static final a f45927f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f45928a;
    public final int f45929b;
    public final int f45930c;
    public final long d;
    public final int f45931e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f45928a = j3;
        this.f45929b = i10;
        this.f45930c = i11;
        this.d = j10;
        this.f45931e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45928a == aVar.f45928a && this.f45929b == aVar.f45929b && this.f45930c == aVar.f45930c && this.d == aVar.d && this.f45931e == aVar.f45931e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45928a;
        long j10 = this.d;
        return this.f45931e ^ ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f45929b) * 1000003) ^ this.f45930c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f45928a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f45929b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f45930c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a4.a.n(this.f45931e, "}", sb2);
    }
}
