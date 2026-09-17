package org.telegram.ui;
public final class rq implements Runnable {
    public final int f40249a;
    public final vr f40250b;

    public rq(vr vrVar, int i10) {
        this.f40249a = i10;
        this.f40250b = vrVar;
    }

    @Override
    public final void run() {
        switch (this.f40249a) {
            case 0:
                this.f40250b.r0();
                return;
            default:
                vr vrVar = this.f40250b;
                vrVar.getMessagesController().loadFullChat(vrVar.N, 0, true);
                return;
        }
    }
}
