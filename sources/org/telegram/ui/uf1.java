package org.telegram.ui;
public final class uf1 implements Runnable {
    public final int f43246a;
    public final ag1 f43247b;
    public final byte[] f43248c;

    public uf1(ag1 ag1Var, byte[] bArr, int i9) {
        this.f43246a = i9;
        this.f43247b = ag1Var;
        this.f43248c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43246a) {
            case 0:
                ag1.X(this.f43247b, this.f43248c);
                return;
            default:
                ag1 ag1Var = this.f43247b;
                ag1Var.v0();
                ag1Var.R = this.f43248c;
                ag1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                ag1 ag1Var2 = new ag1(9, ag1Var.Q);
                ag1Var2.D = ag1Var.D;
                ag1Var2.C = ag1Var.C;
                ag1Var.presentFragment(ag1Var2, true);
                return;
        }
    }
}
