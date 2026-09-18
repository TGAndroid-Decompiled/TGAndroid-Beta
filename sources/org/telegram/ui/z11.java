package org.telegram.ui;
public final class z11 implements Runnable {
    public final int f40101a;
    public final c21 f40102b;
    public final int f40103c;

    public z11(c21 c21Var, int i10, int i11) {
        this.f40101a = i11;
        this.f40102b = c21Var;
        this.f40103c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40101a) {
            case 0:
                c21 c21Var = this.f40102b;
                org.telegram.ui.Components.i81 i81Var = c21Var.f32649n;
                b21 b21Var = c21Var.f32651s;
                int i10 = this.f40103c;
                i81Var.d(i10, b21Var.i(i10));
                return;
            default:
                c21 c21Var2 = this.f40102b;
                org.telegram.ui.Components.i81 i81Var2 = c21Var2.f32649n;
                b21 b21Var2 = c21Var2.f32651s;
                int i11 = this.f40103c;
                i81Var2.d(i11, b21Var2.i(i11));
                return;
        }
    }
}
