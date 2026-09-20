package za;
public final class j {
    public final i f49098a;
    public final i f49099b;
    public final double f49100c;

    public j(i iVar, i iVar2, double d) {
        this.f49098a = iVar;
        this.f49099b = iVar2;
        this.f49100c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f49098a == jVar.f49098a && this.f49099b == jVar.f49099b && Double.valueOf(this.f49100c).equals(Double.valueOf(jVar.f49100c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f49099b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f49100c);
        return ((hashCode + (this.f49098a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f49098a + ", crashlytics=" + this.f49099b + ", sessionSamplingRate=" + this.f49100c + ')';
    }
}
