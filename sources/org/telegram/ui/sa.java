package org.telegram.ui;
public final class sa implements Runnable {
    public final int f42642a;
    public final pb f42643b;

    public sa(pb pbVar, int i9) {
        this.f42642a = i9;
        this.f42643b = pbVar;
    }

    @Override
    public final void run() {
        switch (this.f42642a) {
            case 0:
                pb pbVar = this.f42643b;
                pbVar.G0 = Integer.MAX_VALUE;
                pbVar.H0 = -1;
                pbVar.e1();
                pbVar.I0 = null;
                return;
            case 1:
                pb pbVar2 = this.f42643b;
                pbVar2.X0(false);
                pbVar2.E.l();
                return;
            case 2:
                this.f42643b.W0();
                return;
            default:
                this.f42643b.U0(2);
                return;
        }
    }
}
