package s5;
public final class a {
    public static final a f46713f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f46714a;
    public final int f46715b;
    public final int f46716c;
    public final long d;
    public final int f46717e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f46714a = j3;
        this.f46715b = i10;
        this.f46716c = i11;
        this.d = j10;
        this.f46717e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46714a == aVar.f46714a && this.f46715b == aVar.f46715b && this.f46716c == aVar.f46716c && this.d == aVar.d && this.f46717e == aVar.f46717e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46714a;
        long j10 = this.d;
        return this.f46717e ^ ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f46715b) * 1000003) ^ this.f46716c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f46714a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f46715b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f46716c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a4.a.n(this.f46717e, "}", sb2);
    }
}
