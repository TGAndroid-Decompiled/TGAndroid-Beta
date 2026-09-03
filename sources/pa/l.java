package pa;
public final class l extends i {
    public final ra.l f44278a = new ra.l(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f44278a.equals(this.f44278a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f44278a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f44277a;
        }
        this.f44278a.put(str, iVar);
    }
}
