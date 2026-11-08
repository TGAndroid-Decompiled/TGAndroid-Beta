package v5;

import a8.p0;
public final class a {
    public static final a f57218f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f57219a;
    public final int f57220b;
    public final int f57221c;
    public final long d;
    public final int f57222e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.f57219a = j3;
        this.f57220b = i7;
        this.f57221c = i10;
        this.d = j10;
        this.f57222e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f57219a == aVar.f57219a && this.f57220b == aVar.f57220b && this.f57221c == aVar.f57221c && this.d == aVar.d && this.f57222e == aVar.f57222e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57219a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f57220b) * 1000003) ^ this.f57221c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f57222e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f57219a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f57220b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f57221c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.f57222e, "}", sb2);
    }
}
