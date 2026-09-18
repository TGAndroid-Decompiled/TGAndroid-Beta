package org.telegram.ui;
public final class qq implements Runnable {
    public final int f37013a;
    public final ur f37014b;

    public qq(ur urVar, int i10) {
        this.f37013a = i10;
        this.f37014b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f37013a) {
            case 0:
                this.f37014b.r0();
                return;
            default:
                ur urVar = this.f37014b;
                urVar.getMessagesController().loadFullChat(urVar.N, 0, true);
                return;
        }
    }
}
