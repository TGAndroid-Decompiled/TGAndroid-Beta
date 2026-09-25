package y8;
public final class d implements x8.c {
    public final w3.b f46637a;

    public d(w3.b bVar) {
        this.f46637a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f46637a.equals(((d) obj).f46637a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46637a.hashCode();
    }

    @Override
    public final void onChannelClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f46637a.f44767a).onChannelClosed((x8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onChannelOpened(x8.b bVar) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f46637a.f44767a).onChannelOpened((x8.d) ((f) bVar));
    }

    @Override
    public final void onInputClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f46637a.f44767a).onInputClosed((x8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onOutputClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f46637a.f44767a).onOutputClosed((x8.d) ((f) bVar), i10, i11);
    }
}
