package x6;

import android.os.RemoteException;
import h8.j;
import i8.g;
public final class d implements e {
    public final int f49398a;
    public final j f49399b;

    public d(j jVar, int i10) {
        this.f49398a = i10;
        this.f49399b = jVar;
    }

    @Override
    public final int a() {
        switch (this.f49398a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override
    public final void b() {
        switch (this.f49398a) {
            case 0:
                aa.a aVar = this.f49399b.f11037a;
                aVar.getClass();
                try {
                    g gVar = (g) aVar.f387c;
                    gVar.S0(gVar.O0(), 12);
                    return;
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            default:
                aa.a aVar2 = this.f49399b.f11037a;
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
