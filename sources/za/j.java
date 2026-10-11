package za;
public final class j {
    public final i f54371a;
    public final i f54372b;
    public final double f54373c;

    public j(i iVar, i iVar2, double d) {
        this.f54371a = iVar;
        this.f54372b = iVar2;
        this.f54373c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f54371a == jVar.f54371a && this.f54372b == jVar.f54372b && Double.valueOf(this.f54373c).equals(Double.valueOf(jVar.f54373c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f54372b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f54373c);
        return ((hashCode + (this.f54371a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f54371a + ", crashlytics=" + this.f54372b + ", sessionSamplingRate=" + this.f54373c + ')';
    }
}
