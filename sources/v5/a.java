package v5;

import a8.p0;
public final class a {
    public static final a f57231f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f57232a;
    public final int f57233b;
    public final int f57234c;
    public final long d;
    public final int f57235e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.f57232a = j3;
        this.f57233b = i7;
        this.f57234c = i10;
        this.d = j10;
        this.f57235e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f57232a == aVar.f57232a && this.f57233b == aVar.f57233b && this.f57234c == aVar.f57234c && this.d == aVar.d && this.f57235e == aVar.f57235e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57232a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f57233b) * 1000003) ^ this.f57234c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f57235e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f57232a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f57233b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f57234c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.f57235e, "}", sb2);
    }
}
