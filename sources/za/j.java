package za;
public final class j {
    public final i f48798a;
    public final i f48799b;
    public final double f48800c;

    public j(i iVar, i iVar2, double d) {
        this.f48798a = iVar;
        this.f48799b = iVar2;
        this.f48800c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f48798a == jVar.f48798a && this.f48799b == jVar.f48799b && Double.valueOf(this.f48800c).equals(Double.valueOf(jVar.f48800c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f48799b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f48800c);
        return ((hashCode + (this.f48798a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f48798a + ", crashlytics=" + this.f48799b + ", sessionSamplingRate=" + this.f48800c + ')';
    }
}
