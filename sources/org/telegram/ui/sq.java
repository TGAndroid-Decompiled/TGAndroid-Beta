package org.telegram.ui;
public final class sq implements Runnable {
    public final int f36741a;
    public final wr f36742b;

    public sq(wr wrVar, int i10) {
        this.f36741a = i10;
        this.f36742b = wrVar;
    }

    @Override
    public final void run() {
        switch (this.f36741a) {
            case 0:
                this.f36742b.r0();
                return;
            default:
                wr wrVar = this.f36742b;
                wrVar.getMessagesController().loadFullChat(wrVar.N, 0, true);
                return;
        }
    }
}
