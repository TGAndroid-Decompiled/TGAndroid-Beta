package org.telegram.ui;
public final class wa1 implements Runnable {
    public final int f50968a;
    public final cb1 f50969b;
    public final byte[] f50970c;

    public wa1(cb1 cb1Var, byte[] bArr, int i7) {
        this.f50968a = i7;
        this.f50969b = cb1Var;
        this.f50970c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f50968a) {
            case 0:
                cb1.d0(this.f50969b, this.f50970c);
                return;
            default:
                cb1 cb1Var = this.f50969b;
                cb1Var.B0();
                cb1Var.V = this.f50970c;
                cb1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                cb1 cb1Var2 = new cb1(9, cb1Var.U);
                cb1Var2.H = cb1Var.H;
                cb1Var2.G = cb1Var.G;
                cb1Var.presentFragment(cb1Var2, true);
                return;
        }
    }
}
