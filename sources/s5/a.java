package s5;
public final class a {
    public static final a f45956f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f45957a;
    public final int f45958b;
    public final int f45959c;
    public final long d;
    public final int f45960e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f45957a = j3;
        this.f45958b = i10;
        this.f45959c = i11;
        this.d = j10;
        this.f45960e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45957a == aVar.f45957a && this.f45958b == aVar.f45958b && this.f45959c == aVar.f45959c && this.d == aVar.d && this.f45960e == aVar.f45960e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45957a;
        long j10 = this.d;
        return this.f45960e ^ ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f45958b) * 1000003) ^ this.f45959c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f45957a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f45958b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f45959c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a4.a.n(this.f45960e, "}", sb2);
    }
}
