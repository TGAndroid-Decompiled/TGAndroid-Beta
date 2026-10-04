package za;
public final class j {
    public final i f53123a;
    public final i f53124b;
    public final double f53125c;

    public j(i iVar, i iVar2, double d) {
        this.f53123a = iVar;
        this.f53124b = iVar2;
        this.f53125c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f53123a == jVar.f53123a && this.f53124b == jVar.f53124b && Double.valueOf(this.f53125c).equals(Double.valueOf(jVar.f53125c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f53124b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f53125c);
        return ((hashCode + (this.f53123a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f53123a + ", crashlytics=" + this.f53124b + ", sessionSamplingRate=" + this.f53125c + ')';
    }
}
