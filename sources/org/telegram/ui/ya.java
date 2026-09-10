package org.telegram.ui;
public final class ya implements Runnable {
    public final int f38952a;
    public final wb f38953b;

    public ya(wb wbVar, int i10) {
        this.f38952a = i10;
        this.f38953b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f38952a) {
            case 0:
                wb wbVar = this.f38953b;
                wbVar.K0 = Integer.MAX_VALUE;
                wbVar.L0 = -1;
                wbVar.e1();
                wbVar.M0 = null;
                return;
            case 1:
                wb wbVar2 = this.f38953b;
                wbVar2.X0(false);
                wbVar2.I.l();
                return;
            case 2:
                this.f38953b.W0();
                return;
            default:
                this.f38953b.U0(2);
                return;
        }
    }
}
