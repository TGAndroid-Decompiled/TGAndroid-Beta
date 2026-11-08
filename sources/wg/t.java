package wg;

import android.content.DialogInterface;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
public final class t implements Runnable {
    public final int f57809a;
    public final a0 f57810b;

    public t(a0 a0Var, int i7) {
        this.f57809a = i7;
        this.f57810b = a0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f57809a;
        final a0 a0Var = this.f57810b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.v1(a0Var.f36277k1);
                return;
            case 1:
                qs.f(p10.f24470s0).k(191, a0Var.T1, Boolean.TRUE);
                return;
            case 2:
                qs.f(p10.f24470s0).k(191, a0Var.T1, Boolean.FALSE);
                return;
            case 3:
                ug.f1 f1Var = new ug.f1(a0Var.f36279o1, a0Var.f28616a, null, a0Var.I0);
                f1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = a0Var.Y1.f58717r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.Y1.f58717r;
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
                                yg.r rVar = a0Var.Y1.f58717r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.Y1.f58717r;
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
                ug.f1 f1Var2 = new ug.f1(a0Var.f36279o1, a0Var.f28616a, null, a0Var.I0);
                f1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = a0Var.Y1.f58717r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.Y1.f58717r;
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
                                yg.r rVar = a0Var.Y1.f58717r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.Y1.f58717r;
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
