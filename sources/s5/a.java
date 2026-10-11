package s5;
public final class a {
    public static final a f47923f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f47924a;
    public final int f47925b;
    public final int f47926c;
    public final long d;
    public final int f47927e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f47924a = j3;
        this.f47925b = i10;
        this.f47926c = i11;
        this.d = j10;
        this.f47927e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f47924a == aVar.f47924a && this.f47925b == aVar.f47925b && this.f47926c == aVar.f47926c && this.d == aVar.d && this.f47927e == aVar.f47927e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47924a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f47925b) * 1000003) ^ this.f47926c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f47927e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f47924a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f47925b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f47926c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a1.g.o(this.f47927e, "}", sb2);
    }
}
