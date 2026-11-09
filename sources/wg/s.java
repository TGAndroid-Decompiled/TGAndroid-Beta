package wg;

import android.content.DialogInterface;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
public final class s implements Runnable {
    public final int f57803a;
    public final z f57804b;

    public s(z zVar, int i7) {
        this.f57803a = i7;
        this.f57804b = zVar;
    }

    @Override
    public final void run() {
        int i7 = this.f57803a;
        final z zVar = this.f57804b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.v1(zVar.f36303k1);
                return;
            case 1:
                qs.f(p10.f24470s0).k(191, zVar.T1, Boolean.TRUE);
                return;
            case 2:
                qs.f(p10.f24470s0).k(191, zVar.T1, Boolean.FALSE);
                return;
            case 3:
                ug.f1 f1Var = new ug.f1(zVar.f36305o1, zVar.f28621a, null, zVar.I0);
                f1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = zVar.Y1.f58726r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = zVar.Y1.f58726r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                f1Var.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = zVar.Y1.f58726r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = zVar.Y1.f58726r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                f1Var.show();
                return;
            default:
                ug.f1 f1Var2 = new ug.f1(zVar.f36305o1, zVar.f28621a, null, zVar.I0);
                f1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = zVar.Y1.f58726r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = zVar.Y1.f58726r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                f1Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = zVar.Y1.f58726r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = zVar.Y1.f58726r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                f1Var2.show();
                return;
        }
    }
}
