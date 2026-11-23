package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f53378a;
    public final v0 f53379b;
    public final String f53380c;

    public z(v0 v0Var, String str, int i7) {
        this.f53378a = i7;
        this.f53379b = v0Var;
        this.f53380c = str;
    }

    @Override
    public final void run() {
        switch (this.f53378a) {
            case 0:
                s0 s0Var = this.f53379b.f53305a;
                if (s0Var != null) {
                    s0Var.d(this.f53380c);
                    return;
                }
                return;
            default:
                v0 v0Var = this.f53379b;
                v0Var.O = false;
                v0Var.Q = 0L;
                v0Var.U = false;
                String str = this.f53380c;
                v0Var.f53307b = str;
                v0Var.c();
                s0 s0Var2 = v0Var.f53305a;
                if (s0Var2 != null) {
                    s0Var2.onResume();
                    v0Var.f53305a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
