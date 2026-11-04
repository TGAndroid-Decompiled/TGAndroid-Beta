package p6;
public final class c implements b {
    public final q8.a f53212a;

    public c(q8.a aVar) {
        this.f53212a = aVar;
    }

    @Override
    public final void a(m6.a aVar) {
        boolean c2 = aVar.c();
        q8.a aVar2 = this.f53212a;
        if (c2) {
            aVar2.l(null, aVar2.E);
            return;
        }
        n nVar = aVar2.f53232u;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.f53295a).onConnectionFailed(aVar);
        }
    }
}
