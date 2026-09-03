package pa;
public final class l extends i {
    public final ra.l f41111a = new ra.l(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f41111a.equals(this.f41111a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f41111a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f41110a;
        }
        this.f41111a.put(str, iVar);
    }
}
