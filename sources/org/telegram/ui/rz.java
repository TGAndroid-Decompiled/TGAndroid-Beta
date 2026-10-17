package org.telegram.ui;
public final class rz implements Runnable {
    public final int f40833a;
    public final p00 f40834b;

    public rz(p00 p00Var, int i10) {
        this.f40833a = i10;
        this.f40834b = p00Var;
    }

    @Override
    public final void run() {
        switch (this.f40833a) {
            case 0:
                p00.V(this.f40834b);
                return;
            default:
                p00.W(this.f40834b);
                return;
        }
    }
}
