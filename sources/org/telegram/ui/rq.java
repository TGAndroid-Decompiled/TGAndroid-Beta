package org.telegram.ui;
public final class rq implements Runnable {
    public final int f40222a;
    public final vr f40223b;

    public rq(vr vrVar, int i10) {
        this.f40222a = i10;
        this.f40223b = vrVar;
    }

    @Override
    public final void run() {
        switch (this.f40222a) {
            case 0:
                this.f40223b.r0();
                return;
            default:
                vr vrVar = this.f40223b;
                vrVar.getMessagesController().loadFullChat(vrVar.N, 0, true);
                return;
        }
    }
}
