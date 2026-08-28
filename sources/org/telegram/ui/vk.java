package org.telegram.ui;
public final class vk implements Runnable {
    public final int f43505a;
    public final wk f43506b;

    public vk(wk wkVar, int i9) {
        this.f43505a = i9;
        this.f43506b = wkVar;
    }

    @Override
    public final void run() {
        switch (this.f43505a) {
            case 0:
                ak akVar = this.f43506b.D.U;
                if (akVar != null) {
                    akVar.P0 = false;
                    org.telegram.ui.Components.uf ufVar = akVar.Q0;
                    if (ufVar != null) {
                        ufVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                ak akVar2 = this.f43506b.D.U;
                if (akVar2 != null) {
                    akVar2.G0();
                    return;
                }
                return;
        }
    }
}
