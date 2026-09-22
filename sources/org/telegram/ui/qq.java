package org.telegram.ui;
public final class qq implements Runnable {
    public final int f36932a;
    public final ur f36933b;

    public qq(ur urVar, int i10) {
        this.f36932a = i10;
        this.f36933b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f36932a) {
            case 0:
                this.f36933b.r0();
                return;
            default:
                ur urVar = this.f36933b;
                urVar.getMessagesController().loadFullChat(urVar.N, 0, true);
                return;
        }
    }
}
