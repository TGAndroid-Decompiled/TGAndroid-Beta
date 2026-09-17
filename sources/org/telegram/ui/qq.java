package org.telegram.ui;
public final class qq implements Runnable {
    public final int f37008a;
    public final ur f37009b;

    public qq(ur urVar, int i10) {
        this.f37008a = i10;
        this.f37009b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f37008a) {
            case 0:
                this.f37009b.r0();
                return;
            default:
                ur urVar = this.f37009b;
                urVar.getMessagesController().loadFullChat(urVar.N, 0, true);
                return;
        }
    }
}
