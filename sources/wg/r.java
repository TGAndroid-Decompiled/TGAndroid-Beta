package wg;

import android.content.DialogInterface;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import ug.g1;
public final class r implements Runnable {
    public final int f59231a;
    public final y f59232b;

    public r(y yVar, int i7) {
        this.f59231a = i7;
        this.f59232b = yVar;
    }

    @Override
    public final void run() {
        int i7 = this.f59231a;
        final y yVar = this.f59232b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.v1(yVar.f35936o1);
                return;
            case 1:
                ns.f(m10.f24934t0).k(191, yVar.X1, Boolean.TRUE);
                return;
            case 2:
                ns.f(m10.f24934t0).k(191, yVar.X1, Boolean.FALSE);
                return;
            case 3:
                g1 g1Var = new g1(yVar.f35940s1, yVar.f29679a, null, yVar.J0);
                g1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = yVar.f59275c2.f59906r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = yVar.f59275c2.f59906r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                g1Var.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = yVar.f59275c2.f59906r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = yVar.f59275c2.f59906r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                g1Var.show();
                return;
            default:
                g1 g1Var2 = new g1(yVar.f35940s1, yVar.f29679a, null, yVar.J0);
                g1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = yVar.f59275c2.f59906r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = yVar.f59275c2.f59906r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                g1Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = yVar.f59275c2.f59906r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = yVar.f59275c2.f59906r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                g1Var2.show();
                return;
        }
    }
}
