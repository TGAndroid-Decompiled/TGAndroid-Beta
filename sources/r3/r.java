package r3;
public final class r {
    public final t f46582a;
    public final t f46583b;

    public r(t tVar, t tVar2) {
        this.f46582a = tVar;
        this.f46583b = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f46582a.equals(rVar.f46582a) && this.f46583b.equals(rVar.f46583b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f46583b.hashCode() + (this.f46582a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        t tVar = this.f46582a;
        sb.append(tVar);
        t tVar2 = this.f46583b;
        if (tVar.equals(tVar2)) {
            str = "";
        } else {
            str = ", " + tVar2;
        }
        return android.support.v4.media.a.r(sb, str, "]");
    }
}
