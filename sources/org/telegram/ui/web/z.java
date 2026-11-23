package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f53414a;
    public final v0 f53415b;
    public final String f53416c;

    public z(v0 v0Var, String str, int i7) {
        this.f53414a = i7;
        this.f53415b = v0Var;
        this.f53416c = str;
    }

    @Override
    public final void run() {
        switch (this.f53414a) {
            case 0:
                s0 s0Var = this.f53415b.f53341a;
                if (s0Var != null) {
                    s0Var.d(this.f53416c);
                    return;
                }
                return;
            default:
                v0 v0Var = this.f53415b;
                v0Var.O = false;
                v0Var.Q = 0L;
                v0Var.U = false;
                String str = this.f53416c;
                v0Var.f53343b = str;
                v0Var.c();
                s0 s0Var2 = v0Var.f53341a;
                if (s0Var2 != null) {
                    s0Var2.onResume();
                    v0Var.f53341a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
