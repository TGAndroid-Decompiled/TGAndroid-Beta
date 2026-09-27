package za;
public final class j {
    public final i f49114a;
    public final i f49115b;
    public final double f49116c;

    public j(i iVar, i iVar2, double d) {
        this.f49114a = iVar;
        this.f49115b = iVar2;
        this.f49116c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f49114a == jVar.f49114a && this.f49115b == jVar.f49115b && Double.valueOf(this.f49116c).equals(Double.valueOf(jVar.f49116c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f49115b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f49116c);
        return ((hashCode + (this.f49114a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f49114a + ", crashlytics=" + this.f49115b + ", sessionSamplingRate=" + this.f49116c + ')';
    }
}
