package v5;

import a8.p0;
public final class a {
    public static final a f57219f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f57220a;
    public final int f57221b;
    public final int f57222c;
    public final long d;
    public final int f57223e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.f57220a = j3;
        this.f57221b = i7;
        this.f57222c = i10;
        this.d = j10;
        this.f57223e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f57220a == aVar.f57220a && this.f57221b == aVar.f57221b && this.f57222c == aVar.f57222c && this.d == aVar.d && this.f57223e == aVar.f57223e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57220a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f57221b) * 1000003) ^ this.f57222c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f57223e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f57220a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f57221b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f57222c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.f57223e, "}", sb2);
    }
}
