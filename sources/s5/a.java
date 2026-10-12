package s5;
public final class a {
    public static final a f48064f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f48065a;
    public final int f48066b;
    public final int f48067c;
    public final long d;
    public final int f48068e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f48065a = j3;
        this.f48066b = i10;
        this.f48067c = i11;
        this.d = j10;
        this.f48068e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f48065a == aVar.f48065a && this.f48066b == aVar.f48066b && this.f48067c == aVar.f48067c && this.d == aVar.d && this.f48068e == aVar.f48068e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f48065a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f48066b) * 1000003) ^ this.f48067c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f48068e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f48065a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f48066b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f48067c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a1.g.o(this.f48068e, "}", sb2);
    }
}
