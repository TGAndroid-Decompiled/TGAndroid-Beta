package org.telegram.ui;
public final class va1 implements Runnable {
    public final int f50627a;
    public final bb1 f50628b;
    public final byte[] f50629c;

    public va1(bb1 bb1Var, byte[] bArr, int i7) {
        this.f50627a = i7;
        this.f50628b = bb1Var;
        this.f50629c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f50627a) {
            case 0:
                bb1.d0(this.f50628b, this.f50629c);
                return;
            default:
                bb1 bb1Var = this.f50628b;
                bb1Var.B0();
                bb1Var.V = this.f50629c;
                bb1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                bb1 bb1Var2 = new bb1(9, bb1Var.U);
                bb1Var2.H = bb1Var.H;
                bb1Var2.G = bb1Var.G;
                bb1Var.presentFragment(bb1Var2, true);
                return;
        }
    }
}
