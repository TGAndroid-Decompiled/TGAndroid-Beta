package org.telegram.ui;
public final class x11 extends o51 {
    public final z11 e;

    public x11(z11 z11Var, w11 w11Var) {
        super(w11Var);
        this.e = z11Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f43601n = null;
    }
}
