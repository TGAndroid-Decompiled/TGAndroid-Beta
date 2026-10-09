package s5;
public final class a {
    public static final a f47833f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f47834a;
    public final int f47835b;
    public final int f47836c;
    public final long d;
    public final int f47837e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f47834a = j3;
        this.f47835b = i10;
        this.f47836c = i11;
        this.d = j10;
        this.f47837e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f47834a == aVar.f47834a && this.f47835b == aVar.f47835b && this.f47836c == aVar.f47836c && this.d == aVar.d && this.f47837e == aVar.f47837e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47834a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f47835b) * 1000003) ^ this.f47836c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f47837e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f47834a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f47835b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f47836c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a1.g.o(this.f47837e, "}", sb2);
    }
}
