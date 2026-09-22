package za;
public final class j {
    public final i f49118a;
    public final i f49119b;
    public final double f49120c;

    public j(i iVar, i iVar2, double d) {
        this.f49118a = iVar;
        this.f49119b = iVar2;
        this.f49120c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f49118a == jVar.f49118a && this.f49119b == jVar.f49119b && Double.valueOf(this.f49120c).equals(Double.valueOf(jVar.f49120c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f49119b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f49120c);
        return ((hashCode + (this.f49118a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f49118a + ", crashlytics=" + this.f49119b + ", sessionSamplingRate=" + this.f49120c + ')';
    }
}
