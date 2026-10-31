package org.telegram.ui;
public final class vh implements Runnable {
    public final int f42730a = 1;
    public final int f42731b;
    public final un f42732c;
    public final boolean d;

    public vh(int i10, un unVar, boolean z10) {
        this.f42731b = i10;
        this.f42732c = unVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f42730a) {
            case 0:
                boolean z10 = this.d;
                this.f42732c.Sc(this.f42731b, z10);
                return;
            default:
                int i10 = this.f42731b;
                un unVar = this.f42732c;
                if (i10 != 2) {
                    unVar.ka();
                    unVar.rc();
                }
                yh.f0.f(org.telegram.ui.Components.cc.a0(unVar), i10, this.d);
                return;
        }
    }

    public vh(un unVar, boolean z10, int i10) {
        this.f42732c = unVar;
        this.d = z10;
        this.f42731b = i10;
    }
}
