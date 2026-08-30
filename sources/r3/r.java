package r3;
public final class r {
    public final t f43246a;
    public final t f43247b;

    public r(t tVar, t tVar2) {
        this.f43246a = tVar;
        this.f43247b = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f43246a.equals(rVar.f43246a) && this.f43247b.equals(rVar.f43247b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43247b.hashCode() + (this.f43246a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        t tVar = this.f43246a;
        sb.append(tVar);
        t tVar2 = this.f43247b;
        if (tVar.equals(tVar2)) {
            str = "";
        } else {
            str = ", " + tVar2;
        }
        return android.support.v4.media.a.r(sb, str, "]");
    }
}
