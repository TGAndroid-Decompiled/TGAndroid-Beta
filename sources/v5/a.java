package v5;

import a8.p0;
public final class a {
    public static final a f59271f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f59272a;
    public final int f59273b;
    public final int f59274c;
    public final long d;
    public final int f59275e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.f59272a = j3;
        this.f59273b = i7;
        this.f59274c = i10;
        this.d = j10;
        this.f59275e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f59272a == aVar.f59272a && this.f59273b == aVar.f59273b && this.f59274c == aVar.f59274c && this.d == aVar.d && this.f59275e == aVar.f59275e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59272a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f59273b) * 1000003) ^ this.f59274c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f59275e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f59272a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f59273b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f59274c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.f59275e, "}", sb2);
    }
}
