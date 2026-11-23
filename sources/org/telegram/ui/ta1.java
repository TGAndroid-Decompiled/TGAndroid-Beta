package org.telegram.ui;
public final class ta1 implements Runnable {
    public final int f52333a;
    public final za1 f52334b;
    public final byte[] f52335c;

    public ta1(za1 za1Var, byte[] bArr, int i7) {
        this.f52333a = i7;
        this.f52334b = za1Var;
        this.f52335c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f52333a) {
            case 0:
                za1.d0(this.f52334b, this.f52335c);
                return;
            default:
                za1 za1Var = this.f52334b;
                za1Var.B0();
                za1Var.W = this.f52335c;
                za1Var.getMessagesController().s4(0L, "VALIDATE_PASSWORD");
                za1 za1Var2 = new za1(9, za1Var.V);
                za1Var2.I = za1Var.I;
                za1Var2.H = za1Var.H;
                za1Var.presentFragment(za1Var2, true);
                return;
        }
    }
}
