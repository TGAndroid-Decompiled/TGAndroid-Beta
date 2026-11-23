package v5;

import a8.p0;
public final class a {
    public static final a f59277f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f59278a;
    public final int f59279b;
    public final int f59280c;
    public final long d;
    public final int f59281e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.f59278a = j3;
        this.f59279b = i7;
        this.f59280c = i10;
        this.d = j10;
        this.f59281e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f59278a == aVar.f59278a && this.f59279b == aVar.f59279b && this.f59280c == aVar.f59280c && this.d == aVar.d && this.f59281e == aVar.f59281e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59278a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f59279b) * 1000003) ^ this.f59280c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f59281e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f59278a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f59279b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f59280c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.f59281e, "}", sb2);
    }
}
