package org.telegram.ui;
public final class vg1 implements Runnable {
    public final int f41754a;
    public final bh1 f41755b;
    public final byte[] f41756c;

    public vg1(bh1 bh1Var, byte[] bArr, int i10) {
        this.f41754a = i10;
        this.f41755b = bh1Var;
        this.f41756c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f41754a) {
            case 0:
                bh1.X(this.f41755b, this.f41756c);
                return;
            default:
                bh1 bh1Var = this.f41755b;
                bh1Var.w0();
                bh1Var.V = this.f41756c;
                bh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                bh1 bh1Var2 = new bh1(9, bh1Var.U);
                bh1Var2.H = bh1Var.H;
                bh1Var2.G = bh1Var.G;
                bh1Var.presentFragment(bh1Var2, true);
                return;
        }
    }
}
