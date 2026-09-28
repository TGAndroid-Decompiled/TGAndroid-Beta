package s5;
public final class a {
    public static final a f43130f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f43131a;
    public final int f43132b;
    public final int f43133c;
    public final long d;
    public final int e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f43131a = j3;
        this.f43132b = i10;
        this.f43133c = i11;
        this.d = j10;
        this.e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f43131a == aVar.f43131a && this.f43132b == aVar.f43132b && this.f43133c == aVar.f43133c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f43131a;
        long j10 = this.d;
        return this.e ^ ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f43132b) * 1000003) ^ this.f43133c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f43131a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f43132b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f43133c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a4.a.o(this.e, "}", sb2);
    }
}
