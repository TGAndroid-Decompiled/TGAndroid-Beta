package za;
public final class j {
    public final i f53117a;
    public final i f53118b;
    public final double f53119c;

    public j(i iVar, i iVar2, double d) {
        this.f53117a = iVar;
        this.f53118b = iVar2;
        this.f53119c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f53117a == jVar.f53117a && this.f53118b == jVar.f53118b && Double.valueOf(this.f53119c).equals(Double.valueOf(jVar.f53119c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f53118b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f53119c);
        return ((hashCode + (this.f53117a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f53117a + ", crashlytics=" + this.f53118b + ", sessionSamplingRate=" + this.f53119c + ')';
    }
}
