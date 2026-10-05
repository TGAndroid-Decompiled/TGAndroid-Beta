package s5;
public final class a {
    public static final a f46727f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f46728a;
    public final int f46729b;
    public final int f46730c;
    public final long d;
    public final int f46731e;

    public a(int i10, long j3, long j10, int i11, int i12) {
        this.f46728a = j3;
        this.f46729b = i10;
        this.f46730c = i11;
        this.d = j10;
        this.f46731e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46728a == aVar.f46728a && this.f46729b == aVar.f46729b && this.f46730c == aVar.f46730c && this.d == aVar.d && this.f46731e == aVar.f46731e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46728a;
        long j10 = this.d;
        return this.f46731e ^ ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f46729b) * 1000003) ^ this.f46730c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f46728a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f46729b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f46730c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return a4.a.o(this.f46731e, "}", sb2);
    }
}
