package v5;

import a8.p0;
public final class a {
    public static final a f57127f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f57128a;
    public final int f57129b;
    public final int f57130c;
    public final long d;
    public final int f57131e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.f57128a = j3;
        this.f57129b = i7;
        this.f57130c = i10;
        this.d = j10;
        this.f57131e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f57128a == aVar.f57128a && this.f57129b == aVar.f57129b && this.f57130c == aVar.f57130c && this.d == aVar.d && this.f57131e == aVar.f57131e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57128a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f57129b) * 1000003) ^ this.f57130c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f57131e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f57128a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f57129b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f57130c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.f57131e, "}", sb2);
    }
}
