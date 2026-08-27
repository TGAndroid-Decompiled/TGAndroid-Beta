package org.telegram.ui;

public final class tf1 implements Runnable {

    public final int f42932a;

    public final zf1 f42933b;

    public final byte[] f42934c;

    public tf1(zf1 zf1Var, byte[] bArr, int i10) {
        this.f42932a = i10;
        this.f42933b = zf1Var;
        this.f42934c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f42932a) {
            case 0:
                zf1.Y(this.f42933b, this.f42934c);
                break;
            default:
                zf1 zf1Var = this.f42933b;
                zf1Var.w0();
                zf1Var.R = this.f42934c;
                zf1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                zf1 zf1Var2 = new zf1(9, zf1Var.Q);
                zf1Var2.D = zf1Var.D;
                zf1Var2.C = zf1Var.C;
                zf1Var.presentFragment(zf1Var2, true);
                break;
        }
    }
}
