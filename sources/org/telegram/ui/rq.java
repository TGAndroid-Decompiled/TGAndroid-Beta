package org.telegram.ui;
public final class rq implements Runnable {
    public final int f40221a;
    public final vr f40222b;

    public rq(vr vrVar, int i10) {
        this.f40221a = i10;
        this.f40222b = vrVar;
    }

    @Override
    public final void run() {
        switch (this.f40221a) {
            case 0:
                this.f40222b.r0();
                return;
            default:
                vr vrVar = this.f40222b;
                vrVar.getMessagesController().loadFullChat(vrVar.N, 0, true);
                return;
        }
    }
}
