package z5;
public final class c implements b {
    public final a8.a f50587a;

    public c(a8.a aVar) {
        this.f50587a = aVar;
    }

    @Override
    public final void a(w5.a aVar) {
        boolean c3 = aVar.c();
        a8.a aVar2 = this.f50587a;
        if (c3) {
            aVar2.m(null, aVar2.O);
            return;
        }
        m mVar = aVar2.G;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.f50656a).onConnectionFailed(aVar);
        }
    }
}
