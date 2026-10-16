package y8;
public final class d implements x8.c {
    public final m.h f48604a;

    public d(m.h hVar) {
        this.f48604a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f48604a.equals(((d) obj).f48604a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f48604a.hashCode();
    }

    @Override
    public final void onChannelClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f48604a.f14848b).onChannelClosed((x8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onChannelOpened(x8.b bVar) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f48604a.f14848b).onChannelOpened((x8.d) ((f) bVar));
    }

    @Override
    public final void onInputClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f48604a.f14848b).onInputClosed((x8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onOutputClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f48604a.f14848b).onOutputClosed((x8.d) ((f) bVar), i10, i11);
    }
}
