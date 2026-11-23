package wg;

import android.content.DialogInterface;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import ug.h1;
public final class t implements Runnable {
    public final int f59832a;
    public final a0 f59833b;

    public t(a0 a0Var, int i7) {
        this.f59832a = i7;
        this.f59833b = a0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f59832a;
        final a0 a0Var = this.f59833b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.v1(a0Var.f39487o1);
                return;
            case 1:
                ls.f(k10.f24932t0).k(193, a0Var.X1, Boolean.TRUE);
                return;
            case 2:
                ls.f(k10.f24932t0).k(193, a0Var.X1, Boolean.FALSE);
                return;
            case 3:
                h1 h1Var = new h1(a0Var.f39491s1, a0Var.f30139a, null, a0Var.J0);
                h1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = a0Var.f59705c2.f60486r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.f59705c2.f60486r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                h1Var.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = a0Var.f59705c2.f60486r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.f59705c2.f60486r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                h1Var.show();
                return;
            default:
                h1 h1Var2 = new h1(a0Var.f39491s1, a0Var.f30139a, null, a0Var.J0);
                h1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = a0Var.f59705c2.f60486r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.f59705c2.f60486r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                h1Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = a0Var.f59705c2.f60486r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.f59705c2.f60486r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                h1Var2.show();
                return;
        }
    }
}
