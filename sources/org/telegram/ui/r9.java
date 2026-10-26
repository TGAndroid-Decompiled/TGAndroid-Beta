package org.telegram.ui;
public final class r9 implements o1.f {
    public final int f43057a;
    public final Object f43058b;

    public r9(Object obj, int i10) {
        this.f43057a = i10;
        this.f43058b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f43057a) {
            case 0:
                y9 y9Var = (y9) this.f43058b;
                o1.j jVar = y9Var.f46008y;
                if (jVar != null) {
                    jVar.c();
                    y9Var.f46008y = null;
                    return;
                }
                return;
            case 1:
                lo0 lo0Var = (lo0) this.f43058b;
                if (hVar == lo0Var.f41309c) {
                    lo0Var.f41309c = null;
                    return;
                }
                return;
            default:
                ((bu0) this.f43058b).E();
                return;
        }
    }
}
