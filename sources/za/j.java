package za;
public final class j {
    public final i f48744a;
    public final i f48745b;
    public final double f48746c;

    public j(i iVar, i iVar2, double d) {
        this.f48744a = iVar;
        this.f48745b = iVar2;
        this.f48746c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f48744a == jVar.f48744a && this.f48745b == jVar.f48745b && Double.valueOf(this.f48746c).equals(Double.valueOf(jVar.f48746c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f48745b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f48746c);
        return ((hashCode + (this.f48744a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f48744a + ", crashlytics=" + this.f48745b + ", sessionSamplingRate=" + this.f48746c + ')';
    }
}
