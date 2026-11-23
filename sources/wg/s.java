package wg;

import android.content.DialogInterface;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import ug.h1;
public final class s implements Runnable {
    public final int f59927a;
    public final z f59928b;

    public s(z zVar, int i7) {
        this.f59927a = i7;
        this.f59928b = zVar;
    }

    @Override
    public final void run() {
        int i7 = this.f59927a;
        final z zVar = this.f59928b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.v1(zVar.f39246o1);
                return;
            case 1:
                ks.f(i10.f24637t0).k(193, zVar.X1, Boolean.TRUE);
                return;
            case 2:
                ks.f(i10.f24637t0).k(193, zVar.X1, Boolean.FALSE);
                return;
            case 3:
                h1 h1Var = new h1(zVar.f39250s1, zVar.f30223a, null, zVar.J0);
                h1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = zVar.f59971c2.f60604r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = zVar.f59971c2.f60604r;
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
                                yg.r rVar = zVar.f59971c2.f60604r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = zVar.f59971c2.f60604r;
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
                h1 h1Var2 = new h1(zVar.f39250s1, zVar.f30223a, null, zVar.J0);
                h1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                yg.r rVar = zVar.f59971c2.f60604r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = zVar.f59971c2.f60604r;
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
                                yg.r rVar = zVar.f59971c2.f60604r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                yg.r rVar2 = zVar.f59971c2.f60604r;
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
