package org.telegram.ui;
public final class ta1 implements Runnable {
    public final int f50000a;
    public final za1 f50001b;
    public final byte[] f50002c;

    public ta1(za1 za1Var, byte[] bArr, int i7) {
        this.f50000a = i7;
        this.f50001b = za1Var;
        this.f50002c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f50000a) {
            case 0:
                za1.d0(this.f50001b, this.f50002c);
                return;
            default:
                za1 za1Var = this.f50001b;
                za1Var.B0();
                za1Var.V = this.f50002c;
                za1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                za1 za1Var2 = new za1(9, za1Var.U);
                za1Var2.H = za1Var.H;
                za1Var2.G = za1Var.G;
                za1Var.presentFragment(za1Var2, true);
                return;
        }
    }
}
