package x6;

import android.os.RemoteException;
import h8.j;
import i8.g;
public final class d implements e {
    public final int f49407a;
    public final j f49408b;

    public d(j jVar, int i10) {
        this.f49407a = i10;
        this.f49408b = jVar;
    }

    @Override
    public final int a() {
        switch (this.f49407a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override
    public final void b() {
        switch (this.f49407a) {
            case 0:
                aa.a aVar = this.f49408b.f11038a;
                aVar.getClass();
                try {
                    g gVar = (g) aVar.f387c;
                    gVar.S0(gVar.O0(), 12);
                    return;
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            default:
                aa.a aVar2 = this.f49408b.f11038a;
                aVar2.getClass();
                try {
                    g gVar2 = (g) aVar2.f387c;
                    gVar2.S0(gVar2.O0(), 3);
                    return;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
        }
    }
}
