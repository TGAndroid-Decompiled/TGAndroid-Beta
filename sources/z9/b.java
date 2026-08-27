package z9;

import java.io.IOException;
import w3.b0;

public final class b implements Runnable {

    public final int f50257a;

    public final c f50258b;

    public b(c cVar, int i10) {
        this.f50257a = i10;
        this.f50258b = cVar;
    }

    @Override
    public final void run() {
        aa.b bVarM;
        aa.b bVarI;
        switch (this.f50257a) {
            case 0:
                this.f50258b.b();
                return;
            case 1:
                c cVar = this.f50258b;
                synchronized (c.f50259m) {
                    try {
                        t8.h hVar = cVar.f50260a;
                        hVar.a();
                        b0 b0VarD = b0.d(hVar.f48119a);
                        try {
                            bVarM = cVar.f50262c.M();
                            if (b0VarD != null) {
                                b0VarD.l();
                            }
                        } catch (Throwable th) {
                            if (b0VarD != null) {
                                b0VarD.l();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i10 = bVarM.f206b;
                    if (i10 == 5) {
                        bVarI = cVar.i(bVarM);
                    } else {
                        if (i10 == 3) {
                            bVarI = cVar.i(bVarM);
                        } else if (!cVar.d.a(bVarM)) {
                            return;
                        } else {
                            bVarI = cVar.c(bVarM);
                        }
                    }
                    cVar.f(bVarI);
                    cVar.m(bVarM, bVarI);
                    if (bVarI.f206b == 4) {
                        cVar.l(bVarI.f205a);
                    }
                    int i11 = bVarI.f206b;
                    if (i11 == 5) {
                        cVar.j(new e());
                        return;
                    } else if (i11 == 2 || i11 == 1) {
                        cVar.j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.k(bVarI);
                        return;
                    }
                } catch (e e9) {
                    cVar.j(e9);
                    return;
                }
            default:
                this.f50258b.b();
                return;
        }
    }
}
