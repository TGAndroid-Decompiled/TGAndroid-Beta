package x6;

import android.os.RemoteException;
import h8.j;
import i8.g;
public final class d implements e {
    public final int f49309a;
    public final j f49310b;

    public d(j jVar, int i10) {
        this.f49309a = i10;
        this.f49310b = jVar;
    }

    @Override
    public final int a() {
        switch (this.f49309a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override
    public final void b() {
        switch (this.f49309a) {
            case 0:
                androidx.biometric.e eVar = this.f49310b.f11692a;
                eVar.getClass();
                try {
                    g gVar = (g) eVar.f2816c;
                    gVar.R0(gVar.N0(), 12);
                    return;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            default:
                androidx.biometric.e eVar2 = this.f49310b.f11692a;
                eVar2.getClass();
                try {
                    g gVar2 = (g) eVar2.f2816c;
                    gVar2.R0(gVar2.N0(), 3);
                    return;
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
        }
    }
}
