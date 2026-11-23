package v5;

import a8.p0;
public final class a {
    public static final a f59314f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f59315a;
    public final int f59316b;
    public final int f59317c;
    public final long d;
    public final int f59318e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.f59315a = j3;
        this.f59316b = i7;
        this.f59317c = i10;
        this.d = j10;
        this.f59318e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f59315a == aVar.f59315a && this.f59316b == aVar.f59316b && this.f59317c == aVar.f59317c && this.d == aVar.d && this.f59318e == aVar.f59318e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59315a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f59316b) * 1000003) ^ this.f59317c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f59318e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f59315a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f59316b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f59317c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.f59318e, "}", sb2);
    }
}
