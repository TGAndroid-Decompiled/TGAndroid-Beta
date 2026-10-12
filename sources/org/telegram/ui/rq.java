package org.telegram.ui;
public final class rq implements Runnable {
    public final int f41705a;
    public final wr f41706b;

    public rq(wr wrVar, int i10) {
        this.f41705a = i10;
        this.f41706b = wrVar;
    }

    @Override
    public final void run() {
        switch (this.f41705a) {
            case 0:
                this.f41706b.r0();
                return;
            default:
                wr wrVar = this.f41706b;
                wrVar.getMessagesController().loadFullChat(wrVar.N, 0, true);
                return;
        }
    }
}
