package pa;
public final class l extends i {
    public final ra.l f44247a = new ra.l(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f44247a.equals(this.f44247a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f44247a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f44246a;
        }
        this.f44247a.put(str, iVar);
    }
}
