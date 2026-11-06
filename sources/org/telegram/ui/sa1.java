package org.telegram.ui;
public final class sa1 implements Runnable {
    public final int f49721a;
    public final ya1 f49722b;
    public final byte[] f49723c;

    public sa1(ya1 ya1Var, byte[] bArr, int i7) {
        this.f49721a = i7;
        this.f49722b = ya1Var;
        this.f49723c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f49721a) {
            case 0:
                ya1.d0(this.f49722b, this.f49723c);
                return;
            default:
                ya1 ya1Var = this.f49722b;
                ya1Var.B0();
                ya1Var.V = this.f49723c;
                ya1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                ya1 ya1Var2 = new ya1(9, ya1Var.U);
                ya1Var2.H = ya1Var.H;
                ya1Var2.G = ya1Var.G;
                ya1Var.presentFragment(ya1Var2, true);
                return;
        }
    }
}
