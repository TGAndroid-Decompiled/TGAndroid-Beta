package za;
public final class j {
    public final i f49072a;
    public final i f49073b;
    public final double f49074c;

    public j(i iVar, i iVar2, double d) {
        this.f49072a = iVar;
        this.f49073b = iVar2;
        this.f49074c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f49072a == jVar.f49072a && this.f49073b == jVar.f49073b && Double.valueOf(this.f49074c).equals(Double.valueOf(jVar.f49074c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f49073b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f49074c);
        return ((hashCode + (this.f49072a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f49072a + ", crashlytics=" + this.f49073b + ", sessionSamplingRate=" + this.f49074c + ')';
    }
}
