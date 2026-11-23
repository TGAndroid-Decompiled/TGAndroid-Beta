package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f53651a;
    public final v0 f53652b;
    public final String f53653c;

    public z(v0 v0Var, String str, int i7) {
        this.f53651a = i7;
        this.f53652b = v0Var;
        this.f53653c = str;
    }

    @Override
    public final void run() {
        switch (this.f53651a) {
            case 0:
                s0 s0Var = this.f53652b.f53575a;
                if (s0Var != null) {
                    s0Var.d(this.f53653c);
                    return;
                }
                return;
            default:
                v0 v0Var = this.f53652b;
                v0Var.O = false;
                v0Var.Q = 0L;
                v0Var.U = false;
                String str = this.f53653c;
                v0Var.f53577b = str;
                v0Var.c();
                s0 s0Var2 = v0Var.f53575a;
                if (s0Var2 != null) {
                    s0Var2.onResume();
                    v0Var.f53575a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
