package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f52884a;
    public final v0 f52885b;
    public final String f52886c;

    public z(v0 v0Var, String str, int i7) {
        this.f52884a = i7;
        this.f52885b = v0Var;
        this.f52886c = str;
    }

    @Override
    public final void run() {
        switch (this.f52884a) {
            case 0:
                s0 s0Var = this.f52885b.f52811a;
                if (s0Var != null) {
                    s0Var.d(this.f52886c);
                    return;
                }
                return;
            default:
                v0 v0Var = this.f52885b;
                v0Var.O = false;
                v0Var.Q = 0L;
                v0Var.U = false;
                String str = this.f52886c;
                v0Var.f52813b = str;
                v0Var.c();
                s0 s0Var2 = v0Var.f52811a;
                if (s0Var2 != null) {
                    s0Var2.onResume();
                    v0Var.f52811a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
