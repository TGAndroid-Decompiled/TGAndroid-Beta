package za;
public final class j {
    public final i f53118a;
    public final i f53119b;
    public final double f53120c;

    public j(i iVar, i iVar2, double d) {
        this.f53118a = iVar;
        this.f53119b = iVar2;
        this.f53120c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f53118a == jVar.f53118a && this.f53119b == jVar.f53119b && Double.valueOf(this.f53120c).equals(Double.valueOf(jVar.f53120c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f53119b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f53120c);
        return ((hashCode + (this.f53118a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f53118a + ", crashlytics=" + this.f53119b + ", sessionSamplingRate=" + this.f53120c + ')';
    }
}
