package org.telegram.ui;
public final class vh implements Runnable {
    public final int f42533a = 1;
    public final int f42534b;
    public final un f42535c;
    public final boolean d;

    public vh(int i10, un unVar, boolean z10) {
        this.f42534b = i10;
        this.f42535c = unVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f42533a) {
            case 0:
                boolean z10 = this.d;
                this.f42535c.Xc(this.f42534b, z10);
                return;
            default:
                int i10 = this.f42534b;
                un unVar = this.f42535c;
                if (i10 != 2) {
                    unVar.pa();
                    unVar.wc();
                }
                yh.e0.f(org.telegram.ui.Components.cc.a0(unVar), i10, this.d);
                return;
        }
    }

    public vh(un unVar, boolean z10, int i10) {
        this.f42535c = unVar;
        this.d = z10;
        this.f42534b = i10;
    }
}
