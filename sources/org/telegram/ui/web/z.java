package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f53367a;
    public final v0 f53368b;
    public final String f53369c;

    public z(v0 v0Var, String str, int i7) {
        this.f53367a = i7;
        this.f53368b = v0Var;
        this.f53369c = str;
    }

    @Override
    public final void run() {
        switch (this.f53367a) {
            case 0:
                s0 s0Var = this.f53368b.f53294a;
                if (s0Var != null) {
                    s0Var.d(this.f53369c);
                    return;
                }
                return;
            default:
                v0 v0Var = this.f53368b;
                v0Var.O = false;
                v0Var.Q = 0L;
                v0Var.U = false;
                String str = this.f53369c;
                v0Var.f53296b = str;
                v0Var.c();
                s0 s0Var2 = v0Var.f53294a;
                if (s0Var2 != null) {
                    s0Var2.onResume();
                    v0Var.f53294a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
