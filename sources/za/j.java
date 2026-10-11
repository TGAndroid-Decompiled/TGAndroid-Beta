package za;
public final class j {
    public final i f54337a;
    public final i f54338b;
    public final double f54339c;

    public j(i iVar, i iVar2, double d) {
        this.f54337a = iVar;
        this.f54338b = iVar2;
        this.f54339c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f54337a == jVar.f54337a && this.f54338b == jVar.f54338b && Double.valueOf(this.f54339c).equals(Double.valueOf(jVar.f54339c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f54338b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f54339c);
        return ((hashCode + (this.f54337a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f54337a + ", crashlytics=" + this.f54338b + ", sessionSamplingRate=" + this.f54339c + ')';
    }
}
