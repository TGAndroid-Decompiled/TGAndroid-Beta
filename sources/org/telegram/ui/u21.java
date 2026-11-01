package org.telegram.ui;
public final class u21 implements Runnable {
    public final int f41771a;
    public final ih.b f41772b;

    public u21(ih.b bVar, int i10) {
        this.f41771a = i10;
        this.f41772b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f41771a) {
            case 0:
                org.telegram.messenger.i0.J3(((y11) this.f41772b.Z1).h);
                return;
            default:
                this.f41772b.requestFocus();
                return;
        }
    }
}
