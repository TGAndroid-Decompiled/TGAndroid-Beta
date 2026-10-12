package za;
public final class j {
    public final i f54474a;
    public final i f54475b;
    public final double f54476c;

    public j(i iVar, i iVar2, double d) {
        this.f54474a = iVar;
        this.f54475b = iVar2;
        this.f54476c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f54474a == jVar.f54474a && this.f54475b == jVar.f54475b && Double.valueOf(this.f54476c).equals(Double.valueOf(jVar.f54476c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f54475b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f54476c);
        return ((hashCode + (this.f54474a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f54474a + ", crashlytics=" + this.f54475b + ", sessionSamplingRate=" + this.f54476c + ')';
    }
}
