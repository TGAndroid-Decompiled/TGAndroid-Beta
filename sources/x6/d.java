package x6;

import android.os.RemoteException;
import h8.j;
import i8.g;
public final class d implements e {
    public final int f45348a;
    public final j f45349b;

    public d(j jVar, int i10) {
        this.f45348a = i10;
        this.f45349b = jVar;
    }

    @Override
    public final int a() {
        switch (this.f45348a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override
    public final void b() {
        switch (this.f45348a) {
            case 0:
                aa.a aVar = this.f45349b.f10147a;
                aVar.getClass();
                try {
                    g gVar = (g) aVar.f360c;
                    gVar.S0(gVar.O0(), 12);
                    return;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            default:
                aa.a aVar2 = this.f45349b.f10147a;
                aVar2.getClass();
                try {
                    g gVar2 = (g) aVar2.f360c;
                    gVar2.S0(gVar2.O0(), 3);
                    return;
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
        }
    }
}
