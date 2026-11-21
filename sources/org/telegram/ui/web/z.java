package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f53410a;
    public final v0 f53411b;
    public final String f53412c;

    public z(v0 v0Var, String str, int i7) {
        this.f53410a = i7;
        this.f53411b = v0Var;
        this.f53412c = str;
    }

    @Override
    public final void run() {
        switch (this.f53410a) {
            case 0:
                s0 s0Var = this.f53411b.f53337a;
                if (s0Var != null) {
                    s0Var.d(this.f53412c);
                    return;
                }
                return;
            default:
                v0 v0Var = this.f53411b;
                v0Var.O = false;
                v0Var.Q = 0L;
                v0Var.U = false;
                String str = this.f53412c;
                v0Var.f53339b = str;
                v0Var.c();
                s0 s0Var2 = v0Var.f53337a;
                if (s0Var2 != null) {
                    s0Var2.onResume();
                    v0Var.f53337a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
