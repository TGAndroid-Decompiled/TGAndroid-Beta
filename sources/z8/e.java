package z8;
public final class e implements y8.c {
    public final t6.f f52719a;

    public e(t6.f fVar) {
        this.f52719a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            return this.f52719a.equals(((e) obj).f52719a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f52719a.hashCode();
    }

    @Override
    public final void onChannelClosed(y8.b bVar, int i10, int i11) {
        o6.l.i(bVar, "channel must not be null");
        ((y8.k) this.f52719a.f48715a).onChannelClosed((y8.d) ((g) bVar), i10, i11);
    }

    @Override
    public final void onChannelOpened(y8.b bVar) {
        o6.l.i(bVar, "channel must not be null");
        ((y8.k) this.f52719a.f48715a).onChannelOpened((y8.d) ((g) bVar));
    }

    @Override
    public final void onInputClosed(y8.b bVar, int i10, int i11) {
        o6.l.i(bVar, "channel must not be null");
        ((y8.k) this.f52719a.f48715a).onInputClosed((y8.d) ((g) bVar), i10, i11);
    }

    @Override
    public final void onOutputClosed(y8.b bVar, int i10, int i11) {
        o6.l.i(bVar, "channel must not be null");
        ((y8.k) this.f52719a.f48715a).onOutputClosed((y8.d) ((g) bVar), i10, i11);
    }
}
