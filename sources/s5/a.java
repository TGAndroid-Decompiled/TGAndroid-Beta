package s5;
public final class a {
    public static final a f43098f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f43099a;
    public final int f43100b;
    public final int f43101c;
    public final long d;
    public final int e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f43099a = j3;
        this.f43100b = i10;
        this.f43101c = i11;
        this.d = j10;
        this.e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f43099a == aVar.f43099a && this.f43100b == aVar.f43100b && this.f43101c == aVar.f43101c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f43099a;
        long j10 = this.d;
        return this.e ^ ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f43100b) * 1000003) ^ this.f43101c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f43099a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f43100b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f43101c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a4.a.n(this.e, "}", sb2);
    }
}
