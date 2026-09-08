package org.telegram.ui;
public final class rq implements Runnable {
    public final int f40248a;
    public final vr f40249b;

    public rq(vr vrVar, int i10) {
        this.f40248a = i10;
        this.f40249b = vrVar;
    }

    @Override
    public final void run() {
        switch (this.f40248a) {
            case 0:
                this.f40249b.r0();
                return;
            default:
                vr vrVar = this.f40249b;
                vrVar.getMessagesController().loadFullChat(vrVar.N, 0, true);
                return;
        }
    }
}
