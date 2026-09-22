package za;
public final class j {
    public final i f48791a;
    public final i f48792b;
    public final double f48793c;

    public j(i iVar, i iVar2, double d) {
        this.f48791a = iVar;
        this.f48792b = iVar2;
        this.f48793c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f48791a == jVar.f48791a && this.f48792b == jVar.f48792b && Double.valueOf(this.f48793c).equals(Double.valueOf(jVar.f48793c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f48792b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f48793c);
        return ((hashCode + (this.f48791a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f48791a + ", crashlytics=" + this.f48792b + ", sessionSamplingRate=" + this.f48793c + ')';
    }
}
