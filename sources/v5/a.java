package v5;

import a8.p0;
public final class a {
    public static final a f59396f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f59397a;
    public final int f59398b;
    public final int f59399c;
    public final long d;
    public final int f59400e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.f59397a = j3;
        this.f59398b = i7;
        this.f59399c = i10;
        this.d = j10;
        this.f59400e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f59397a == aVar.f59397a && this.f59398b == aVar.f59398b && this.f59399c == aVar.f59399c && this.d == aVar.d && this.f59400e == aVar.f59400e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59397a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f59398b) * 1000003) ^ this.f59399c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f59400e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f59397a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f59398b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f59399c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.f59400e, "}", sb2);
    }
}
