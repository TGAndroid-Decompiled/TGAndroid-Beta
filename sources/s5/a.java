package s5;
public final class a {
    public static final a f46712f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f46713a;
    public final int f46714b;
    public final int f46715c;
    public final long d;
    public final int f46716e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f46713a = j3;
        this.f46714b = i10;
        this.f46715c = i11;
        this.d = j10;
        this.f46716e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46713a == aVar.f46713a && this.f46714b == aVar.f46714b && this.f46715c == aVar.f46715c && this.d == aVar.d && this.f46716e == aVar.f46716e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46713a;
        long j10 = this.d;
        return this.f46716e ^ ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f46714b) * 1000003) ^ this.f46715c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f46713a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f46714b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f46715c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a4.a.n(this.f46716e, "}", sb2);
    }
}
