package v5;

import a8.p0;
public final class a {
    public static final a f57126f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f57127a;
    public final int f57128b;
    public final int f57129c;
    public final long d;
    public final int f57130e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.f57127a = j3;
        this.f57128b = i7;
        this.f57129c = i10;
        this.d = j10;
        this.f57130e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f57127a == aVar.f57127a && this.f57128b == aVar.f57128b && this.f57129c == aVar.f57129c && this.d == aVar.d && this.f57130e == aVar.f57130e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57127a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f57128b) * 1000003) ^ this.f57129c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f57130e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f57127a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f57128b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f57129c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.f57130e, "}", sb2);
    }
}
