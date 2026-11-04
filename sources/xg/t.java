package xg;

import android.content.DialogInterface;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import vg.h1;
public final class t implements Runnable {
    public final int f58759a;
    public final a0 f58760b;

    public t(a0 a0Var, int i3) {
        this.f58759a = i3;
        this.f58760b = a0Var;
    }

    @Override
    public final void run() {
        int i3 = this.f58759a;
        final a0 a0Var = this.f58760b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.v1(a0Var.f36102l1);
                return;
            case 1:
                hs.f(h10.f22829t0).k(191, a0Var.U1, Boolean.TRUE);
                return;
            case 2:
                hs.f(h10.f22829t0).k(191, a0Var.U1, Boolean.FALSE);
                return;
            case 3:
                h1 h1Var = new h1(a0Var.f36105p1, a0Var.f28583a, null, a0Var.J0);
                h1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                zg.r rVar = a0Var.Z1.f59434r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                zg.r rVar2 = a0Var.Z1.f59434r;
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
                                zg.r rVar = a0Var.Z1.f59434r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                zg.r rVar2 = a0Var.Z1.f59434r;
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
                h1 h1Var2 = new h1(a0Var.f36105p1, a0Var.f28583a, null, a0Var.J0);
                h1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                zg.r rVar = a0Var.Z1.f59434r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                zg.r rVar2 = a0Var.Z1.f59434r;
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
                                zg.r rVar = a0Var.Z1.f59434r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                zg.r rVar2 = a0Var.Z1.f59434r;
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
