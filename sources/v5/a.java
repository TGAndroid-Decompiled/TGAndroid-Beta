package v5;

import a8.p0;
public final class a {
    public static final a f59272f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f59273a;
    public final int f59274b;
    public final int f59275c;
    public final long d;
    public final int f59276e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.f59273a = j3;
        this.f59274b = i7;
        this.f59275c = i10;
        this.d = j10;
        this.f59276e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f59273a == aVar.f59273a && this.f59274b == aVar.f59274b && this.f59275c == aVar.f59275c && this.d == aVar.d && this.f59276e == aVar.f59276e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59273a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f59274b) * 1000003) ^ this.f59275c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f59276e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f59273a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f59274b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f59275c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.f59276e, "}", sb2);
    }
}
