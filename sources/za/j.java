package za;
public final class j {
    public final i f48821a;
    public final i f48822b;
    public final double f48823c;

    public j(i iVar, i iVar2, double d) {
        this.f48821a = iVar;
        this.f48822b = iVar2;
        this.f48823c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f48821a == jVar.f48821a && this.f48822b == jVar.f48822b && Double.valueOf(this.f48823c).equals(Double.valueOf(jVar.f48823c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f48822b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f48823c);
        return ((hashCode + (this.f48821a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f48821a + ", crashlytics=" + this.f48822b + ", sessionSamplingRate=" + this.f48823c + ')';
    }
}
