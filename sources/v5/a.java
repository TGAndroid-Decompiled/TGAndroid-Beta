package v5;

import a8.p0;
public final class a {
    public static final a f58702f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f58703a;
    public final int f58704b;
    public final int f58705c;
    public final long d;
    public final int f58706e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.f58703a = j3;
        this.f58704b = i7;
        this.f58705c = i10;
        this.d = j10;
        this.f58706e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f58703a == aVar.f58703a && this.f58704b == aVar.f58704b && this.f58705c == aVar.f58705c && this.d == aVar.d && this.f58706e == aVar.f58706e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f58703a;
        long j10 = this.d;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f58704b) * 1000003) ^ this.f58705c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f58706e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f58703a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f58704b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f58705c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.f58706e, "}", sb2);
    }
}
