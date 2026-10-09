package x6;

import android.os.RemoteException;
import h8.j;
import i8.g;
public final class d implements e {
    public final int f50688a;
    public final j f50689b;

    public d(j jVar, int i10) {
        this.f50688a = i10;
        this.f50689b = jVar;
    }

    @Override
    public final int a() {
        switch (this.f50688a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override
    public final void b() {
        switch (this.f50688a) {
            case 0:
                aa.a aVar = this.f50689b.f11042a;
                aVar.getClass();
                try {
                    g gVar = (g) aVar.f385c;
                    gVar.R0(gVar.N0(), 12);
                    return;
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            default:
                aa.a aVar2 = this.f50689b.f11042a;
                aVar2.getClass();
                try {
                    g gVar2 = (g) aVar2.f385c;
                    gVar2.R0(gVar2.N0(), 3);
                    return;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
        }
    }
}
