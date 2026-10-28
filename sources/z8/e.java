package z8;
public final class e implements y8.c {
    public final t6.f f52780a;

    public e(t6.f fVar) {
        this.f52780a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            return this.f52780a.equals(((e) obj).f52780a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f52780a.hashCode();
    }

    @Override
    public final void onChannelClosed(y8.b bVar, int i10, int i11) {
        o6.l.i(bVar, "channel must not be null");
        ((y8.k) this.f52780a.f48753a).onChannelClosed((y8.d) ((g) bVar), i10, i11);
    }

    @Override
    public final void onChannelOpened(y8.b bVar) {
        o6.l.i(bVar, "channel must not be null");
        ((y8.k) this.f52780a.f48753a).onChannelOpened((y8.d) ((g) bVar));
    }

    @Override
    public final void onInputClosed(y8.b bVar, int i10, int i11) {
        o6.l.i(bVar, "channel must not be null");
        ((y8.k) this.f52780a.f48753a).onInputClosed((y8.d) ((g) bVar), i10, i11);
    }

    @Override
    public final void onOutputClosed(y8.b bVar, int i10, int i11) {
        o6.l.i(bVar, "channel must not be null");
        ((y8.k) this.f52780a.f48753a).onOutputClosed((y8.d) ((g) bVar), i10, i11);
    }
}
