package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f53416a;
    public final v0 f53417b;
    public final String f53418c;

    public z(v0 v0Var, String str, int i7) {
        this.f53416a = i7;
        this.f53417b = v0Var;
        this.f53418c = str;
    }

    @Override
    public final void run() {
        switch (this.f53416a) {
            case 0:
                s0 s0Var = this.f53417b.f53343a;
                if (s0Var != null) {
                    s0Var.d(this.f53418c);
                    return;
                }
                return;
            default:
                v0 v0Var = this.f53417b;
                v0Var.O = false;
                v0Var.Q = 0L;
                v0Var.U = false;
                String str = this.f53418c;
                v0Var.f53345b = str;
                v0Var.c();
                s0 s0Var2 = v0Var.f53343a;
                if (s0Var2 != null) {
                    s0Var2.onResume();
                    v0Var.f53343a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
