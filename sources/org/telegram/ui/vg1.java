package org.telegram.ui;
public final class vg1 implements Runnable {
    public final int f41747a;
    public final bh1 f41748b;
    public final byte[] f41749c;

    public vg1(bh1 bh1Var, byte[] bArr, int i10) {
        this.f41747a = i10;
        this.f41748b = bh1Var;
        this.f41749c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f41747a) {
            case 0:
                bh1.X(this.f41748b, this.f41749c);
                return;
            default:
                bh1 bh1Var = this.f41748b;
                bh1Var.w0();
                bh1Var.V = this.f41749c;
                bh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                bh1 bh1Var2 = new bh1(9, bh1Var.U);
                bh1Var2.H = bh1Var.H;
                bh1Var2.G = bh1Var.G;
                bh1Var.presentFragment(bh1Var2, true);
                return;
        }
    }
}
