package r3;
public final class r {
    public final t f43270a;
    public final t f43271b;

    public r(t tVar, t tVar2) {
        this.f43270a = tVar;
        this.f43271b = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f43270a.equals(rVar.f43270a) && this.f43271b.equals(rVar.f43271b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43271b.hashCode() + (this.f43270a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        t tVar = this.f43270a;
        sb.append(tVar);
        t tVar2 = this.f43271b;
        if (tVar.equals(tVar2)) {
            str = "";
        } else {
            str = ", " + tVar2;
        }
        return android.support.v4.media.a.r(sb, str, "]");
    }
}
