package v5;

import a8.p0;
public final class a {
    public static final a f59310f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f59311a;
    public final int f59312b;
    public final int f59313c;
    public final long d;
    public final int f59314e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.f59311a = j3;
        this.f59312b = i7;
        this.f59313c = i10;
        this.d = j10;
        this.f59314e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f59311a == aVar.f59311a && this.f59312b == aVar.f59312b && this.f59313c == aVar.f59313c && this.d == aVar.d && this.f59314e == aVar.f59314e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59311a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f59312b) * 1000003) ^ this.f59313c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f59314e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f59311a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f59312b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f59313c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.f59314e, "}", sb2);
    }
}
