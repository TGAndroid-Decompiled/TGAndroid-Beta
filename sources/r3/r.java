package r3;
public final class r {
    public final t f46613a;
    public final t f46614b;

    public r(t tVar, t tVar2) {
        this.f46613a = tVar;
        this.f46614b = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f46613a.equals(rVar.f46613a) && this.f46614b.equals(rVar.f46614b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f46614b.hashCode() + (this.f46613a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        t tVar = this.f46613a;
        sb.append(tVar);
        t tVar2 = this.f46614b;
        if (tVar.equals(tVar2)) {
            str = "";
        } else {
            str = ", " + tVar2;
        }
        return android.support.v4.media.a.r(sb, str, "]");
    }
}
