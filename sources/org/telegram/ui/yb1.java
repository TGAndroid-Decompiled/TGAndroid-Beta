package org.telegram.ui;
public final class yb1 implements fc1 {
    public boolean f44815a;
    public final qn f44816b;

    public yb1(qn qnVar, boolean z10) {
        this.f44816b = qnVar;
        this.f44815a = z10;
    }

    @Override
    public final boolean X0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f44815a;
    }

    @Override
    public final void m1(boolean z10) {
        boolean z11 = !this.f44815a;
        this.f44815a = z11;
        on onVar = this.f44816b.f41848aa;
        onVar.i(onVar.f41205f, onVar.h, z10, Boolean.valueOf(z11), false);
    }
}
