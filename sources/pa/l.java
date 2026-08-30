package pa;
public final class l extends i {
    public final ra.l f41088a = new ra.l(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f41088a.equals(this.f41088a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f41088a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f41087a;
        }
        this.f41088a.put(str, iVar);
    }
}
