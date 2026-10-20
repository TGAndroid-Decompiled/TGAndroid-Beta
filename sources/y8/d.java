package y8;
public final class d implements x8.c {
    public final k2.w0 f49993a;

    public d(k2.w0 w0Var) {
        this.f49993a = w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f49993a.equals(((d) obj).f49993a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f49993a.hashCode();
    }

    @Override
    public final void onChannelClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f49993a.f14830b).onChannelClosed((x8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onChannelOpened(x8.b bVar) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f49993a.f14830b).onChannelOpened((x8.d) ((f) bVar));
    }

    @Override
    public final void onInputClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f49993a.f14830b).onInputClosed((x8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onOutputClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.f49993a.f14830b).onOutputClosed((x8.d) ((f) bVar), i10, i11);
    }
}
