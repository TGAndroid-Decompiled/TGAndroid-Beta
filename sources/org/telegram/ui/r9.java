package org.telegram.ui;
public final class r9 implements o1.f {
    public final int f42892a;
    public final Object f42893b;

    public r9(Object obj, int i10) {
        this.f42892a = i10;
        this.f42893b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f42892a) {
            case 0:
                y9 y9Var = (y9) this.f42893b;
                o1.j jVar = y9Var.f45903y;
                if (jVar != null) {
                    jVar.c();
                    y9Var.f45903y = null;
                    return;
                }
                return;
            case 1:
                no0 no0Var = (no0) this.f42893b;
                if (hVar == no0Var.f41832c) {
                    no0Var.f41832c = null;
                    return;
                }
                return;
            default:
                ((du0) this.f42893b).E();
                return;
        }
    }
}
