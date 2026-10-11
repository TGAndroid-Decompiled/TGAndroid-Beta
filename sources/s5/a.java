package s5;
public final class a {
    public static final a f47957f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f47958a;
    public final int f47959b;
    public final int f47960c;
    public final long d;
    public final int f47961e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f47958a = j3;
        this.f47959b = i10;
        this.f47960c = i11;
        this.d = j10;
        this.f47961e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f47958a == aVar.f47958a && this.f47959b == aVar.f47959b && this.f47960c == aVar.f47960c && this.d == aVar.d && this.f47961e == aVar.f47961e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47958a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f47959b) * 1000003) ^ this.f47960c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f47961e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f47958a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f47959b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f47960c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a1.g.o(this.f47961e, "}", sb2);
    }
}
