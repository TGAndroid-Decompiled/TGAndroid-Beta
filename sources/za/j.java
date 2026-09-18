package za;
public final class j {
    public final i f49052a;
    public final i f49053b;
    public final double f49054c;

    public j(i iVar, i iVar2, double d) {
        this.f49052a = iVar;
        this.f49053b = iVar2;
        this.f49054c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f49052a == jVar.f49052a && this.f49053b == jVar.f49053b && Double.valueOf(this.f49054c).equals(Double.valueOf(jVar.f49054c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f49053b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f49054c);
        return ((hashCode + (this.f49052a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f49052a + ", crashlytics=" + this.f49053b + ", sessionSamplingRate=" + this.f49054c + ')';
    }
}
