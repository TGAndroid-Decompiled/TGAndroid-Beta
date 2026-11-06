package wg;

import android.content.DialogInterface;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
public final class t implements Runnable {
    public final int f57692a;
    public final a0 f57693b;

    public t(a0 a0Var, int i7) {
        this.f57692a = i7;
        this.f57693b = a0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f57692a;
        final a0 a0Var = this.f57693b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.v1(a0Var.f36328k1);
                return;
            case 1:
                qs.f(p10.f24459s0).k(191, a0Var.T1, Boolean.TRUE);
                return;
            case 2:
                qs.f(p10.f24459s0).k(191, a0Var.T1, Boolean.FALSE);
                return;
            case 3:
                ug.f1 f1Var = new ug.f1(a0Var.f36330o1, a0Var.f28612a, null, a0Var.I0);
                f1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = a0Var.Y1.f58597r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.Y1.f58597r;
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
                                yg.r rVar = a0Var.Y1.f58597r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.Y1.f58597r;
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
                ug.f1 f1Var2 = new ug.f1(a0Var.f36330o1, a0Var.f28612a, null, a0Var.I0);
                f1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = a0Var.Y1.f58597r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.Y1.f58597r;
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
                                yg.r rVar = a0Var.Y1.f58597r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = a0Var.Y1.f58597r;
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
