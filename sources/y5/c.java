package y5;

public final class c implements b {

    public final z7.a f49604a;

    public c(z7.a aVar) {
        this.f49604a = aVar;
    }

    @Override
    public final void a(v5.a aVar) {
        boolean zC = aVar.c();
        z7.a aVar2 = this.f49604a;
        if (zC) {
            aVar2.i(null, aVar2.O);
            return;
        }
        m mVar = aVar2.G;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.f49673a).onConnectionFailed(aVar);
        }
    }
}
