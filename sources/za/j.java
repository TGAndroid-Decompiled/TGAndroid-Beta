package za;
public final class j {
    public final i f54252a;
    public final i f54253b;
    public final double f54254c;

    public j(i iVar, i iVar2, double d) {
        this.f54252a = iVar;
        this.f54253b = iVar2;
        this.f54254c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f54252a == jVar.f54252a && this.f54253b == jVar.f54253b && Double.valueOf(this.f54254c).equals(Double.valueOf(jVar.f54254c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f54253b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f54254c);
        return ((hashCode + (this.f54252a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f54252a + ", crashlytics=" + this.f54253b + ", sessionSamplingRate=" + this.f54254c + ')';
    }
}
