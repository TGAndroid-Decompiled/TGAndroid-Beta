package q6;
public final class c implements b {
    public final r8.a f53835a;

    public c(r8.a aVar) {
        this.f53835a = aVar;
    }

    @Override
    public final void a(n6.a aVar) {
        boolean c10 = aVar.c();
        r8.a aVar2 = this.f53835a;
        if (c10) {
            aVar2.g(null, aVar2.E);
            return;
        }
        n nVar = aVar2.f53855u;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.f53918a).onConnectionFailed(aVar);
        }
    }
}
