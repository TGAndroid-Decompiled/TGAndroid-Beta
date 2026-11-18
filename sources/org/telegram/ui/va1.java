package org.telegram.ui;
public final class va1 implements Runnable {
    public final int f52734a;
    public final bb1 f52735b;
    public final byte[] f52736c;

    public va1(bb1 bb1Var, byte[] bArr, int i7) {
        this.f52734a = i7;
        this.f52735b = bb1Var;
        this.f52736c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f52734a) {
            case 0:
                bb1.d0(this.f52735b, this.f52736c);
                return;
            default:
                bb1 bb1Var = this.f52735b;
                bb1Var.B0();
                bb1Var.W = this.f52736c;
                bb1Var.getMessagesController().s4(0L, "VALIDATE_PASSWORD");
                bb1 bb1Var2 = new bb1(9, bb1Var.V);
                bb1Var2.I = bb1Var.I;
                bb1Var2.H = bb1Var.H;
                bb1Var.presentFragment(bb1Var2, true);
                return;
        }
    }
}
