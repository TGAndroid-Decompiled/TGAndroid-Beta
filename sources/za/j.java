package za;
public final class j {
    public final i f49073a;
    public final i f49074b;
    public final double f49075c;

    public j(i iVar, i iVar2, double d) {
        this.f49073a = iVar;
        this.f49074b = iVar2;
        this.f49075c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f49073a == jVar.f49073a && this.f49074b == jVar.f49074b && Double.valueOf(this.f49075c).equals(Double.valueOf(jVar.f49075c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f49074b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f49075c);
        return ((hashCode + (this.f49073a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f49073a + ", crashlytics=" + this.f49074b + ", sessionSamplingRate=" + this.f49075c + ')';
    }
}
