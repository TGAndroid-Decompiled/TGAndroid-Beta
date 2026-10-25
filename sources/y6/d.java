package y6;

import a8.h0;
import android.os.RemoteException;
import i8.j;
import j8.g;
public final class d implements e {
    public final int f52064a;
    public final j f52065b;

    public d(j jVar, int i10) {
        this.f52064a = i10;
        this.f52065b = jVar;
    }

    @Override
    public final int a() {
        switch (this.f52064a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override
    public final void b() {
        switch (this.f52064a) {
            case 0:
                h0 h0Var = this.f52065b.f13893a;
                h0Var.getClass();
                try {
                    g gVar = (g) h0Var.f512c;
                    gVar.R0(gVar.N0(), 12);
                    return;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            default:
                h0 h0Var2 = this.f52065b.f13893a;
                h0Var2.getClass();
                try {
                    g gVar2 = (g) h0Var2.f512c;
                    gVar2.R0(gVar2.N0(), 3);
                    return;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
        }
    }
}
