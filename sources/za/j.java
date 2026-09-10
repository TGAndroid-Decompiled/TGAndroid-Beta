package za;
public final class j {
    public final i f47915a;
    public final i f47916b;
    public final double f47917c;

    public j(i iVar, i iVar2, double d) {
        this.f47915a = iVar;
        this.f47916b = iVar2;
        this.f47917c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f47915a == jVar.f47915a && this.f47916b == jVar.f47916b && Double.valueOf(this.f47917c).equals(Double.valueOf(jVar.f47917c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f47916b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f47917c);
        return ((hashCode + (this.f47915a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f47915a + ", crashlytics=" + this.f47916b + ", sessionSamplingRate=" + this.f47917c + ')';
    }
}
