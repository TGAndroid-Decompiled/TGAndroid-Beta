package org.telegram.ui;
public final class qq implements Runnable {
    public final int f36930a;
    public final ur f36931b;

    public qq(ur urVar, int i10) {
        this.f36930a = i10;
        this.f36931b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f36930a) {
            case 0:
                this.f36931b.r0();
                return;
            default:
                ur urVar = this.f36931b;
                urVar.getMessagesController().loadFullChat(urVar.N, 0, true);
                return;
        }
    }
}
