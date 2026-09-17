package za;
public final class j {
    public final i f51446a;
    public final i f51447b;
    public final double f51448c;

    public j(i iVar, i iVar2, double d) {
        this.f51446a = iVar;
        this.f51447b = iVar2;
        this.f51448c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f51446a == jVar.f51446a && this.f51447b == jVar.f51447b && Double.valueOf(this.f51448c).equals(Double.valueOf(jVar.f51448c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f51447b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f51448c);
        return ((hashCode + (this.f51446a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f51446a + ", crashlytics=" + this.f51447b + ", sessionSamplingRate=" + this.f51448c + ')';
    }
}
