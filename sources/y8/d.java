package y8;
public final class d implements x8.c {
    public final mg.n f49586a;

    public d(mg.n nVar) {
        this.f49586a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f49586a.equals(((d) obj).f49586a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f49586a.hashCode();
    }

    @Override
    public final void onChannelClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f49586a.f16292b).onChannelClosed((x8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onChannelOpened(x8.b bVar) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f49586a.f16292b).onChannelOpened((x8.d) ((f) bVar));
    }

    @Override
    public final void onInputClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f49586a.f16292b).onInputClosed((x8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onOutputClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f49586a.f16292b).onOutputClosed((x8.d) ((f) bVar), i10, i11);
    }
}
