package org.telegram.ui;
public final class y90 implements Runnable {
    public final int f52231a;
    public final la0 f52232b;
    public final org.telegram.messenger.sa f52233c;

    public y90(la0 la0Var, org.telegram.messenger.sa saVar, int i3) {
        this.f52231a = i3;
        this.f52232b = la0Var;
        this.f52233c = saVar;
    }

    @Override
    public final void run() {
        switch (this.f52231a) {
            case 0:
                la0 la0Var = this.f52232b;
                org.telegram.messenger.sa saVar = this.f52233c;
                if (la0Var.H != null && la0Var.getParentActivity() != null) {
                    try {
                        ((b8.ke) saVar).w();
                        ((mb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f25457b);
                        ((b8.ke) la0Var.H).o(new aa0(la0Var, 0));
                        la0Var.f47271x0 = true;
                        if (la0Var.f47273y0) {
                            ((b8.ke) la0Var.H).A();
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                la0 la0Var2 = this.f52232b;
                org.telegram.messenger.sa saVar2 = this.f52233c;
                try {
                    ((b8.ke) saVar2).w();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new y90(la0Var2, saVar2, 0));
                return;
        }
    }
}
