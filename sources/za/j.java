package za;
public final class j {
    public final i f51445a;
    public final i f51446b;
    public final double f51447c;

    public j(i iVar, i iVar2, double d) {
        this.f51445a = iVar;
        this.f51446b = iVar2;
        this.f51447c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f51445a == jVar.f51445a && this.f51446b == jVar.f51446b && Double.valueOf(this.f51447c).equals(Double.valueOf(jVar.f51447c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f51446b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f51447c);
        return ((hashCode + (this.f51445a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f51445a + ", crashlytics=" + this.f51446b + ", sessionSamplingRate=" + this.f51447c + ')';
    }
}
