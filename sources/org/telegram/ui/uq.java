package org.telegram.ui;
public final class uq implements Runnable {
    public final int f40468a;
    public final yr f40469b;

    public uq(yr yrVar, int i10) {
        this.f40468a = i10;
        this.f40469b = yrVar;
    }

    @Override
    public final void run() {
        switch (this.f40468a) {
            case 0:
                this.f40469b.r0();
                return;
            default:
                yr yrVar = this.f40469b;
                yrVar.getMessagesController().loadFullChat(yrVar.N, 0, true);
                return;
        }
    }
}
