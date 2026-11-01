package org.telegram.ui;
public final class w21 implements Runnable {
    public final int f42663a;
    public final x21 f42664b;

    public w21(x21 x21Var, int i10) {
        this.f42663a = i10;
        this.f42664b = x21Var;
    }

    @Override
    public final void run() {
        switch (this.f42663a) {
            case 0:
                x21.a(this.f42664b);
                return;
            default:
                this.f42664b.dismiss();
                return;
        }
    }
}
