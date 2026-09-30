package za;
public final class j {
    public final i f49074a;
    public final i f49075b;
    public final double f49076c;

    public j(i iVar, i iVar2, double d) {
        this.f49074a = iVar;
        this.f49075b = iVar2;
        this.f49076c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f49074a == jVar.f49074a && this.f49075b == jVar.f49075b && Double.valueOf(this.f49076c).equals(Double.valueOf(jVar.f49076c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f49075b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f49076c);
        return ((hashCode + (this.f49074a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f49074a + ", crashlytics=" + this.f49075b + ", sessionSamplingRate=" + this.f49076c + ')';
    }
}
