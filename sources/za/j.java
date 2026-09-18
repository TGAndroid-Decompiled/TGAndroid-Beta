package za;
public final class j {
    public final i f48826a;
    public final i f48827b;
    public final double f48828c;

    public j(i iVar, i iVar2, double d) {
        this.f48826a = iVar;
        this.f48827b = iVar2;
        this.f48828c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f48826a == jVar.f48826a && this.f48827b == jVar.f48827b && Double.valueOf(this.f48828c).equals(Double.valueOf(jVar.f48828c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f48827b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f48828c);
        return ((hashCode + (this.f48826a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f48826a + ", crashlytics=" + this.f48827b + ", sessionSamplingRate=" + this.f48828c + ')';
    }
}
