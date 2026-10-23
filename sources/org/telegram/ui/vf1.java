package org.telegram.ui;
public final class vf1 implements Runnable {
    public final int f42762a;
    public final bg1 f42763b;
    public final byte[] f42764c;

    public vf1(bg1 bg1Var, byte[] bArr, int i10) {
        this.f42762a = i10;
        this.f42763b = bg1Var;
        this.f42764c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f42762a) {
            case 0:
                bg1.Y(this.f42763b, this.f42764c);
                return;
            default:
                bg1 bg1Var = this.f42763b;
                bg1Var.w0();
                bg1Var.V = this.f42764c;
                bg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                bg1 bg1Var2 = new bg1(9, bg1Var.U);
                bg1Var2.H = bg1Var.H;
                bg1Var2.G = bg1Var.G;
                bg1Var.presentFragment(bg1Var2, true);
                return;
        }
    }
}
