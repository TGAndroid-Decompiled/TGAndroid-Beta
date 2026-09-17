package org.telegram.ui;
public final class z11 implements Runnable {
    public final int f40096a;
    public final c21 f40097b;
    public final int f40098c;

    public z11(c21 c21Var, int i10, int i11) {
        this.f40096a = i11;
        this.f40097b = c21Var;
        this.f40098c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40096a) {
            case 0:
                c21 c21Var = this.f40097b;
                org.telegram.ui.Components.i81 i81Var = c21Var.f32645n;
                b21 b21Var = c21Var.f32647s;
                int i10 = this.f40098c;
                i81Var.d(i10, b21Var.i(i10));
                return;
            default:
                c21 c21Var2 = this.f40097b;
                org.telegram.ui.Components.i81 i81Var2 = c21Var2.f32645n;
                b21 b21Var2 = c21Var2.f32647s;
                int i11 = this.f40098c;
                i81Var2.d(i11, b21Var2.i(i11));
                return;
        }
    }
}
