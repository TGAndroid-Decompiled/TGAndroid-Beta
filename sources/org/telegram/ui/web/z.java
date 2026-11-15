package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f52887a;
    public final v0 f52888b;
    public final String f52889c;

    public z(v0 v0Var, String str, int i7) {
        this.f52887a = i7;
        this.f52888b = v0Var;
        this.f52889c = str;
    }

    @Override
    public final void run() {
        switch (this.f52887a) {
            case 0:
                s0 s0Var = this.f52888b.f52814a;
                if (s0Var != null) {
                    s0Var.d(this.f52889c);
                    return;
                }
                return;
            default:
                v0 v0Var = this.f52888b;
                v0Var.O = false;
                v0Var.Q = 0L;
                v0Var.U = false;
                String str = this.f52889c;
                v0Var.f52816b = str;
                v0Var.c();
                s0 s0Var2 = v0Var.f52814a;
                if (s0Var2 != null) {
                    s0Var2.onResume();
                    v0Var.f52814a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
