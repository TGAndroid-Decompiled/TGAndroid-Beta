package za;
public final class j {
    public final i f49061a;
    public final i f49062b;
    public final double f49063c;

    public j(i iVar, i iVar2, double d) {
        this.f49061a = iVar;
        this.f49062b = iVar2;
        this.f49063c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f49061a == jVar.f49061a && this.f49062b == jVar.f49062b && Double.valueOf(this.f49063c).equals(Double.valueOf(jVar.f49063c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f49062b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f49063c);
        return ((hashCode + (this.f49061a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f49061a + ", crashlytics=" + this.f49062b + ", sessionSamplingRate=" + this.f49063c + ')';
    }
}
