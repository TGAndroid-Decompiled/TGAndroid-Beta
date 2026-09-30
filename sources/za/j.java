package za;
public final class j {
    public final i f49180a;
    public final i f49181b;
    public final double f49182c;

    public j(i iVar, i iVar2, double d) {
        this.f49180a = iVar;
        this.f49181b = iVar2;
        this.f49182c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f49180a == jVar.f49180a && this.f49181b == jVar.f49181b && Double.valueOf(this.f49182c).equals(Double.valueOf(jVar.f49182c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f49181b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f49182c);
        return ((hashCode + (this.f49180a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f49180a + ", crashlytics=" + this.f49181b + ", sessionSamplingRate=" + this.f49182c + ')';
    }
}
