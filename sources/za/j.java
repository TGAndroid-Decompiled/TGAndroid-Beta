package za;
public final class j {
    public final i f51476a;
    public final i f51477b;
    public final double f51478c;

    public j(i iVar, i iVar2, double d) {
        this.f51476a = iVar;
        this.f51477b = iVar2;
        this.f51478c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f51476a == jVar.f51476a && this.f51477b == jVar.f51477b && Double.valueOf(this.f51478c).equals(Double.valueOf(jVar.f51478c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f51477b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f51478c);
        return ((hashCode + (this.f51476a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f51476a + ", crashlytics=" + this.f51477b + ", sessionSamplingRate=" + this.f51478c + ')';
    }
}
