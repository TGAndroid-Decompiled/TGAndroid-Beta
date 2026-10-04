package org.telegram.ui;
public final class vg1 implements Runnable {
    public final int f41746a;
    public final bh1 f41747b;
    public final byte[] f41748c;

    public vg1(bh1 bh1Var, byte[] bArr, int i10) {
        this.f41746a = i10;
        this.f41747b = bh1Var;
        this.f41748c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f41746a) {
            case 0:
                bh1.X(this.f41747b, this.f41748c);
                return;
            default:
                bh1 bh1Var = this.f41747b;
                bh1Var.w0();
                bh1Var.V = this.f41748c;
                bh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                bh1 bh1Var2 = new bh1(9, bh1Var.U);
                bh1Var2.H = bh1Var.H;
                bh1Var2.G = bh1Var.G;
                bh1Var.presentFragment(bh1Var2, true);
                return;
        }
    }
}
