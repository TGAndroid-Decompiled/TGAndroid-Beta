package org.telegram.ui;
public final class w21 implements Runnable {
    public final int f42864a;
    public final ih.b f42865b;

    public w21(ih.b bVar, int i10) {
        this.f42864a = i10;
        this.f42865b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f42864a) {
            case 0:
                org.telegram.messenger.i0.J3(((a21) this.f42865b.Z1).h);
                return;
            default:
                this.f42865b.requestFocus();
                return;
        }
    }
}
