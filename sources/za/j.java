package za;
public final class j {
    public final i f54482a;
    public final i f54483b;
    public final double f54484c;

    public j(i iVar, i iVar2, double d) {
        this.f54482a = iVar;
        this.f54483b = iVar2;
        this.f54484c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f54482a == jVar.f54482a && this.f54483b == jVar.f54483b && Double.valueOf(this.f54484c).equals(Double.valueOf(jVar.f54484c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f54483b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f54484c);
        return ((hashCode + (this.f54482a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f54482a + ", crashlytics=" + this.f54483b + ", sessionSamplingRate=" + this.f54484c + ')';
    }
}
