package wg;

import android.content.DialogInterface;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import ug.i1;
public final class t implements Runnable {
    public final int f59822a;
    public final a0 f59823b;

    public t(a0 a0Var, int i7) {
        this.f59822a = i7;
        this.f59823b = a0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f59822a;
        final a0 a0Var = this.f59823b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.v1(a0Var.f39534o1);
                return;
            case 1:
                ks.f(j10.f24770t0).k(193, a0Var.X1, Boolean.TRUE);
                return;
            case 2:
                ks.f(j10.f24770t0).k(193, a0Var.X1, Boolean.FALSE);
                return;
            case 3:
                i1 i1Var = new i1(a0Var.f39538s1, a0Var.f30187a, null, a0Var.J0);
                i1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = a0Var.f59698c2.f60476r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.f59698c2.f60476r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                i1Var.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = a0Var.f59698c2.f60476r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.f59698c2.f60476r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                i1Var.show();
                return;
            default:
                i1 i1Var2 = new i1(a0Var.f39538s1, a0Var.f30187a, null, a0Var.J0);
                i1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = a0Var.f59698c2.f60476r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.f59698c2.f60476r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                i1Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = a0Var.f59698c2.f60476r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.f59698c2.f60476r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                i1Var2.show();
                return;
        }
    }
}
