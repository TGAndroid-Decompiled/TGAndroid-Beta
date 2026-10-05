package za;
public final class j {
    public final i f53144a;
    public final i f53145b;
    public final double f53146c;

    public j(i iVar, i iVar2, double d) {
        this.f53144a = iVar;
        this.f53145b = iVar2;
        this.f53146c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f53144a == jVar.f53144a && this.f53145b == jVar.f53145b && Double.valueOf(this.f53146c).equals(Double.valueOf(jVar.f53146c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f53145b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f53146c);
        return ((hashCode + (this.f53144a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f53144a + ", crashlytics=" + this.f53145b + ", sessionSamplingRate=" + this.f53146c + ')';
    }
}
