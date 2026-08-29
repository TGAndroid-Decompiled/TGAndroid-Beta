package org.telegram.ui;
public final class ra implements Runnable {
    public final int f42018a;
    public final ob f42019b;

    public ra(ob obVar, int i10) {
        this.f42018a = i10;
        this.f42019b = obVar;
    }

    @Override
    public final void run() {
        switch (this.f42018a) {
            case 0:
                ob obVar = this.f42019b;
                obVar.G0 = Integer.MAX_VALUE;
                obVar.H0 = -1;
                obVar.e1();
                obVar.I0 = null;
                return;
            case 1:
                ob obVar2 = this.f42019b;
                obVar2.X0(false);
                obVar2.E.l();
                return;
            case 2:
                this.f42019b.W0();
                return;
            default:
                this.f42019b.U0(2);
                return;
        }
    }
}
