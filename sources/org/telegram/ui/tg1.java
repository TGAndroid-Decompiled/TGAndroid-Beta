package org.telegram.ui;
public final class tg1 implements Runnable {
    public final int f38098a;
    public final zg1 f38099b;
    public final byte[] f38100c;

    public tg1(zg1 zg1Var, byte[] bArr, int i10) {
        this.f38098a = i10;
        this.f38099b = zg1Var;
        this.f38100c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f38098a) {
            case 0:
                zg1.Y(this.f38099b, this.f38100c);
                return;
            default:
                zg1 zg1Var = this.f38099b;
                zg1Var.w0();
                zg1Var.V = this.f38100c;
                zg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                zg1 zg1Var2 = new zg1(9, zg1Var.U);
                zg1Var2.H = zg1Var.H;
                zg1Var2.G = zg1Var.G;
                zg1Var.presentFragment(zg1Var2, true);
                return;
        }
    }
}
