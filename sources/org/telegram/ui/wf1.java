package org.telegram.ui;
public final class wf1 implements Runnable {
    public final int f44301a;
    public final cg1 f44302b;
    public final byte[] f44303c;

    public wf1(cg1 cg1Var, byte[] bArr, int i10) {
        this.f44301a = i10;
        this.f44302b = cg1Var;
        this.f44303c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f44301a) {
            case 0:
                cg1.Y(this.f44302b, this.f44303c);
                return;
            default:
                cg1 cg1Var = this.f44302b;
                cg1Var.w0();
                cg1Var.R = this.f44303c;
                cg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                cg1 cg1Var2 = new cg1(9, cg1Var.Q);
                cg1Var2.D = cg1Var.D;
                cg1Var2.C = cg1Var.C;
                cg1Var.presentFragment(cg1Var2, true);
                return;
        }
    }
}
