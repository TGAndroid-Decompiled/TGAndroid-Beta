package org.telegram.ui;

public final class ta implements Runnable {

    public final int f42839a;

    public final qb f42840b;

    public ta(qb qbVar, int i10) {
        this.f42839a = i10;
        this.f42840b = qbVar;
    }

    @Override
    public final void run() {
        switch (this.f42839a) {
            case 0:
                qb qbVar = this.f42840b;
                qbVar.G0 = Integer.MAX_VALUE;
                qbVar.H0 = -1;
                qbVar.e1();
                qbVar.I0 = null;
                break;
            case 1:
                qb qbVar2 = this.f42840b;
                qbVar2.X0(false);
                qbVar2.E.l();
                break;
            case 2:
                this.f42840b.W0();
                break;
            default:
                this.f42840b.U0(2);
                break;
        }
    }
}
