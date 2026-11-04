package org.telegram.ui;
public final class wy implements Runnable {
    public final int f51630a;
    public final yy f51631b;

    public wy(yy yyVar, int i3) {
        this.f51630a = i3;
        this.f51631b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f51630a) {
            case 0:
                this.f51631b.d();
                return;
            case 1:
                this.f51631b.a();
                return;
            default:
                yy yyVar = this.f51631b;
                yyVar.b(yyVar.E);
                return;
        }
    }
}
