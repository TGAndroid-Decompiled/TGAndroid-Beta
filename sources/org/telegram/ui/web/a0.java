package org.telegram.ui.web;
public final class a0 implements Runnable {
    public final int f50808a;
    public final w0 f50809b;
    public final String f50810c;

    public a0(w0 w0Var, String str, int i3) {
        this.f50808a = i3;
        this.f50809b = w0Var;
        this.f50810c = str;
    }

    @Override
    public final void run() {
        switch (this.f50808a) {
            case 0:
                t0 t0Var = this.f50809b.f51060a;
                if (t0Var != null) {
                    t0Var.d(this.f50810c);
                    return;
                }
                return;
            default:
                w0 w0Var = this.f50809b;
                w0Var.O = false;
                w0Var.Q = 0L;
                w0Var.U = false;
                String str = this.f50810c;
                w0Var.f51062b = str;
                w0Var.c();
                t0 t0Var2 = w0Var.f51060a;
                if (t0Var2 != null) {
                    t0Var2.onResume();
                    w0Var.f51060a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
