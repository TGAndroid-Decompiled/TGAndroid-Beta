package s5;
public final class a {
    public static final a f46720f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f46721a;
    public final int f46722b;
    public final int f46723c;
    public final long d;
    public final int f46724e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f46721a = j3;
        this.f46722b = i10;
        this.f46723c = i11;
        this.d = j10;
        this.f46724e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46721a == aVar.f46721a && this.f46722b == aVar.f46722b && this.f46723c == aVar.f46723c && this.d == aVar.d && this.f46724e == aVar.f46724e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46721a;
        long j10 = this.d;
        return this.f46724e ^ ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f46722b) * 1000003) ^ this.f46723c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f46721a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f46722b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f46723c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a4.a.o(this.f46724e, "}", sb2);
    }
}
