package org.telegram.ui;
public final class uq implements Runnable {
    public final int f40785a;
    public final yr f40786b;

    public uq(yr yrVar, int i10) {
        this.f40785a = i10;
        this.f40786b = yrVar;
    }

    @Override
    public final void run() {
        switch (this.f40785a) {
            case 0:
                this.f40786b.r0();
                return;
            default:
                yr yrVar = this.f40786b;
                yrVar.getMessagesController().loadFullChat(yrVar.N, 0, true);
                return;
        }
    }
}
