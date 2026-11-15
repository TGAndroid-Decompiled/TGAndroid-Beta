package org.telegram.ui;
public final class ra1 implements Runnable {
    public final int f50894a;
    public final xa1 f50895b;
    public final byte[] f50896c;

    public ra1(xa1 xa1Var, byte[] bArr, int i7) {
        this.f50894a = i7;
        this.f50895b = xa1Var;
        this.f50896c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f50894a) {
            case 0:
                xa1.d0(this.f50895b, this.f50896c);
                return;
            default:
                xa1 xa1Var = this.f50895b;
                xa1Var.B0();
                xa1Var.W = this.f50896c;
                xa1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                xa1 xa1Var2 = new xa1(9, xa1Var.V);
                xa1Var2.I = xa1Var.I;
                xa1Var2.H = xa1Var.H;
                xa1Var.presentFragment(xa1Var2, true);
                return;
        }
    }
}
