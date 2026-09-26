package za;
public final class j {
    public final i f49071a;
    public final i f49072b;
    public final double f49073c;

    public j(i iVar, i iVar2, double d) {
        this.f49071a = iVar;
        this.f49072b = iVar2;
        this.f49073c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f49071a == jVar.f49071a && this.f49072b == jVar.f49072b && Double.valueOf(this.f49073c).equals(Double.valueOf(jVar.f49073c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f49072b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f49073c);
        return ((hashCode + (this.f49071a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f49071a + ", crashlytics=" + this.f49072b + ", sessionSamplingRate=" + this.f49073c + ')';
    }
}
