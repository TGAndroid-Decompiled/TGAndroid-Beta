package s5;
public final class a {
    public static final a f47877f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f47878a;
    public final int f47879b;
    public final int f47880c;
    public final long d;
    public final int f47881e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f47878a = j3;
        this.f47879b = i10;
        this.f47880c = i11;
        this.d = j10;
        this.f47881e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f47878a == aVar.f47878a && this.f47879b == aVar.f47879b && this.f47880c == aVar.f47880c && this.d == aVar.d && this.f47881e == aVar.f47881e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47878a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f47879b) * 1000003) ^ this.f47880c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f47881e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f47878a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f47879b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f47880c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a1.g.o(this.f47881e, "}", sb2);
    }
}
