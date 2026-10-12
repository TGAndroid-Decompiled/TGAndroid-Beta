package y8;
public final class d implements x8.c {
    public final w3.c f51988a;

    public d(w3.c cVar) {
        this.f51988a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f51988a.equals(((d) obj).f51988a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51988a.hashCode();
    }

    @Override
    public final void onChannelClosed(x8.b bVar, int i10, int i11) {
        n6.m.i(bVar, "channel must not be null");
        ((x8.k) this.f51988a.f49996a).onChannelClosed((x8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onChannelOpened(x8.b bVar) {
        n6.m.i(bVar, "channel must not be null");
        ((x8.k) this.f51988a.f49996a).onChannelOpened((x8.d) ((f) bVar));
    }

    @Override
    public final void onInputClosed(x8.b bVar, int i10, int i11) {
        n6.m.i(bVar, "channel must not be null");
        ((x8.k) this.f51988a.f49996a).onInputClosed((x8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onOutputClosed(x8.b bVar, int i10, int i11) {
        n6.m.i(bVar, "channel must not be null");
        ((x8.k) this.f51988a.f49996a).onOutputClosed((x8.d) ((f) bVar), i10, i11);
    }
}
