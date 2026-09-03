package org.telegram.ui.web;
public final class q implements Runnable {
    public final int f42633a;
    public final a1 f42634b;
    public final String f42635c;

    public q(a1 a1Var, String str, int i10) {
        this.f42633a = i10;
        this.f42634b = a1Var;
        this.f42635c = str;
    }

    @Override
    public final void run() {
        switch (this.f42633a) {
            case 0:
                x0 x0Var = this.f42634b.f42429a;
                if (x0Var != null) {
                    x0Var.d(this.f42635c);
                    return;
                }
                return;
            default:
                a1 a1Var = this.f42634b;
                a1Var.K = false;
                a1Var.M = 0L;
                a1Var.Q = false;
                String str = this.f42635c;
                a1Var.f42431b = str;
                a1Var.c();
                x0 x0Var2 = a1Var.f42429a;
                if (x0Var2 != null) {
                    x0Var2.onResume();
                    a1Var.f42429a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
