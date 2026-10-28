package org.telegram.ui;
public final class zf1 implements Runnable {
    public final int f46260a;
    public final fg1 f46261b;
    public final byte[] f46262c;

    public zf1(fg1 fg1Var, byte[] bArr, int i10) {
        this.f46260a = i10;
        this.f46261b = fg1Var;
        this.f46262c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f46260a) {
            case 0:
                fg1.Z(this.f46261b, this.f46262c);
                return;
            default:
                fg1 fg1Var = this.f46261b;
                fg1Var.x0();
                fg1Var.V = this.f46262c;
                fg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                fg1 fg1Var2 = new fg1(9, fg1Var.U);
                fg1Var2.H = fg1Var.H;
                fg1Var2.G = fg1Var.G;
                fg1Var.presentFragment(fg1Var2, true);
                return;
        }
    }
}
