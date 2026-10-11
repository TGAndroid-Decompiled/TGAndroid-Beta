package y8;
public final class d implements x8.c {
    public final w3.d f51885a;

    public d(w3.d dVar) {
        this.f51885a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f51885a.equals(((d) obj).f51885a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51885a.hashCode();
    }

    @Override
    public final void onChannelClosed(x8.b bVar, int i10, int i11) {
        n6.m.i(bVar, "channel must not be null");
        ((x8.k) this.f51885a.f49890a).onChannelClosed((x8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onChannelOpened(x8.b bVar) {
        n6.m.i(bVar, "channel must not be null");
        ((x8.k) this.f51885a.f49890a).onChannelOpened((x8.d) ((f) bVar));
    }

    @Override
    public final void onInputClosed(x8.b bVar, int i10, int i11) {
        n6.m.i(bVar, "channel must not be null");
        ((x8.k) this.f51885a.f49890a).onInputClosed((x8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onOutputClosed(x8.b bVar, int i10, int i11) {
        n6.m.i(bVar, "channel must not be null");
        ((x8.k) this.f51885a.f49890a).onOutputClosed((x8.d) ((f) bVar), i10, i11);
    }
}
