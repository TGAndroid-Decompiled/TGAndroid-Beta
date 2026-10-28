package s9;
public final class j {
    public final s f48037a;
    public final boolean f48038b;

    public j(s sVar, boolean z10) {
        this.f48037a = sVar;
        this.f48038b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.f48037a.equals(this.f48037a) && jVar.f48038b == this.f48038b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f48037a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f48038b).hashCode();
    }
}
