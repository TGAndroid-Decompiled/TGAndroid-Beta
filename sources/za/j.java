package za;
public final class j {
    public final i f54296a;
    public final i f54297b;
    public final double f54298c;

    public j(i iVar, i iVar2, double d) {
        this.f54296a = iVar;
        this.f54297b = iVar2;
        this.f54298c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f54296a == jVar.f54296a && this.f54297b == jVar.f54297b && Double.valueOf(this.f54298c).equals(Double.valueOf(jVar.f54298c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f54297b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f54298c);
        return ((hashCode + (this.f54296a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f54296a + ", crashlytics=" + this.f54297b + ", sessionSamplingRate=" + this.f54298c + ')';
    }
}
