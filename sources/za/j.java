package za;
public final class j {
    public final i f54250a;
    public final i f54251b;
    public final double f54252c;

    public j(i iVar, i iVar2, double d) {
        this.f54250a = iVar;
        this.f54251b = iVar2;
        this.f54252c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f54250a == jVar.f54250a && this.f54251b == jVar.f54251b && Double.valueOf(this.f54252c).equals(Double.valueOf(jVar.f54252c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f54251b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f54252c);
        return ((hashCode + (this.f54250a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f54250a + ", crashlytics=" + this.f54251b + ", sessionSamplingRate=" + this.f54252c + ')';
    }
}
