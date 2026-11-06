package v5;

import a8.p0;
public final class a {
    public static final a f57102f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f57103a;
    public final int f57104b;
    public final int f57105c;
    public final long d;
    public final int f57106e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.f57103a = j3;
        this.f57104b = i7;
        this.f57105c = i10;
        this.d = j10;
        this.f57106e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f57103a == aVar.f57103a && this.f57104b == aVar.f57104b && this.f57105c == aVar.f57105c && this.d == aVar.d && this.f57106e == aVar.f57106e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57103a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f57104b) * 1000003) ^ this.f57105c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f57106e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f57103a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f57104b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f57105c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.f57106e, "}", sb2);
    }
}
