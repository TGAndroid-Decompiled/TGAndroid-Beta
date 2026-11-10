package v5;

import a8.p0;
public final class a {
    public static final a f57227f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f57228a;
    public final int f57229b;
    public final int f57230c;
    public final long d;
    public final int f57231e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.f57228a = j3;
        this.f57229b = i7;
        this.f57230c = i10;
        this.d = j10;
        this.f57231e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f57228a == aVar.f57228a && this.f57229b == aVar.f57229b && this.f57230c == aVar.f57230c && this.d == aVar.d && this.f57231e == aVar.f57231e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57228a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f57229b) * 1000003) ^ this.f57230c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f57231e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f57228a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f57229b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f57230c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.f57231e, "}", sb2);
    }
}
