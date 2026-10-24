package org.telegram.ui;
public final class uf1 implements Runnable {
    public final int f42416a;
    public final ag1 f42417b;
    public final byte[] f42418c;

    public uf1(ag1 ag1Var, byte[] bArr, int i10) {
        this.f42416a = i10;
        this.f42417b = ag1Var;
        this.f42418c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f42416a) {
            case 0:
                ag1.Y(this.f42417b, this.f42418c);
                return;
            default:
                ag1 ag1Var = this.f42417b;
                ag1Var.w0();
                ag1Var.V = this.f42418c;
                ag1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                ag1 ag1Var2 = new ag1(9, ag1Var.U);
                ag1Var2.H = ag1Var.H;
                ag1Var2.G = ag1Var.G;
                ag1Var.presentFragment(ag1Var2, true);
                return;
        }
    }
}
