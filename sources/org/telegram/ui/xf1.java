package org.telegram.ui;
public final class xf1 implements Runnable {
    public final int f45760a;
    public final dg1 f45761b;
    public final byte[] f45762c;

    public xf1(dg1 dg1Var, byte[] bArr, int i10) {
        this.f45760a = i10;
        this.f45761b = dg1Var;
        this.f45762c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f45760a) {
            case 0:
                dg1.Z(this.f45761b, this.f45762c);
                return;
            default:
                dg1 dg1Var = this.f45761b;
                dg1Var.x0();
                dg1Var.V = this.f45762c;
                dg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                dg1 dg1Var2 = new dg1(9, dg1Var.U);
                dg1Var2.H = dg1Var.H;
                dg1Var2.G = dg1Var.G;
                dg1Var.presentFragment(dg1Var2, true);
                return;
        }
    }
}
