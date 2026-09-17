package za;
public final class j {
    public final i f51477a;
    public final i f51478b;
    public final double f51479c;

    public j(i iVar, i iVar2, double d) {
        this.f51477a = iVar;
        this.f51478b = iVar2;
        this.f51479c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f51477a == jVar.f51477a && this.f51478b == jVar.f51478b && Double.valueOf(this.f51479c).equals(Double.valueOf(jVar.f51479c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f51478b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f51479c);
        return ((hashCode + (this.f51477a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f51477a + ", crashlytics=" + this.f51478b + ", sessionSamplingRate=" + this.f51479c + ')';
    }
}
