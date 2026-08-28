package x5;
public final class c implements b {
    public final y7.a f48887a;

    public c(y7.a aVar) {
        this.f48887a = aVar;
    }

    @Override
    public final void a(u5.a aVar) {
        boolean c10 = aVar.c();
        y7.a aVar2 = this.f48887a;
        if (c10) {
            aVar2.c(null, aVar2.O);
            return;
        }
        m mVar = aVar2.G;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.f48956a).onConnectionFailed(aVar);
        }
    }
}
