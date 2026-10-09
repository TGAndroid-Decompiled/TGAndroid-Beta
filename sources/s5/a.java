package s5;
public final class a {
    public static final a f47831f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f47832a;
    public final int f47833b;
    public final int f47834c;
    public final long d;
    public final int f47835e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f47832a = j3;
        this.f47833b = i10;
        this.f47834c = i11;
        this.d = j10;
        this.f47835e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f47832a == aVar.f47832a && this.f47833b == aVar.f47833b && this.f47834c == aVar.f47834c && this.d == aVar.d && this.f47835e == aVar.f47835e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47832a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f47833b) * 1000003) ^ this.f47834c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f47835e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f47832a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f47833b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f47834c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a1.g.o(this.f47835e, "}", sb2);
    }
}
