package org.telegram.ui;
public final class va1 implements Runnable {
    public final int f52780a;
    public final bb1 f52781b;
    public final byte[] f52782c;

    public va1(bb1 bb1Var, byte[] bArr, int i7) {
        this.f52780a = i7;
        this.f52781b = bb1Var;
        this.f52782c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f52780a) {
            case 0:
                bb1.d0(this.f52781b, this.f52782c);
                return;
            default:
                bb1 bb1Var = this.f52781b;
                bb1Var.B0();
                bb1Var.W = this.f52782c;
                bb1Var.getMessagesController().s4(0L, "VALIDATE_PASSWORD");
                bb1 bb1Var2 = new bb1(9, bb1Var.V);
                bb1Var2.I = bb1Var.I;
                bb1Var2.H = bb1Var.H;
                bb1Var.presentFragment(bb1Var2, true);
                return;
        }
    }
}
