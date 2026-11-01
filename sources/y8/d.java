package y8;
public final class d implements x8.a {
    public final jb.b f54239a;

    public d(jb.b bVar) {
        this.f54239a = bVar;
    }

    @Override
    public final void a(f fVar) {
        n6.l.h(fVar, "channel must not be null");
    }

    @Override
    public final void b(f fVar) {
        n6.l.h(fVar, "channel must not be null");
    }

    @Override
    public final void c(f fVar) {
        n6.l.h(fVar, "channel must not be null");
    }

    @Override
    public final void d(f fVar) {
        n6.l.h(fVar, "channel must not be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f54239a.equals(((d) obj).f54239a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f54239a.hashCode();
    }
}
