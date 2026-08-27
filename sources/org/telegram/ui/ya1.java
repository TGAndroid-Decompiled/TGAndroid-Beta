package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

public final class ya1 implements Runnable {

    public final int f44750a;

    public final nc1 f44751b;

    public ya1(nc1 nc1Var, int i10) {
        this.f44750a = i10;
        this.f44751b = nc1Var;
    }

    @Override
    public final void run() {
        int i10 = this.f44750a;
        nc1 nc1Var = this.f44751b;
        switch (i10) {
            case 0:
                nc1Var.V = false;
                int i11 = nc1Var.S;
                int i12 = nc1Var.T;
                org.telegram.ui.ActionBar.e6 e6Var = nc1Var.f40781s;
                int i13 = nc1Var.f40769n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        e6Var.f22885c = i11;
                        org.telegram.ui.ActionBar.g6.n1(false, false);
                    } else if (i12 == 1) {
                        e6Var.d = i11;
                        org.telegram.ui.ActionBar.g6.n1(true, true);
                        nc1Var.f40776q0.f1();
                        nc1Var.R.setHasChanges(nc1Var.T0(nc1Var.f40769n));
                        nc1Var.m1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        e6Var.f22890j = i11;
                    } else if (i12 == 1) {
                        int iB0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                        if (i11 != 0 || iB0 == 0) {
                            e6Var.f22891k = i11;
                        } else {
                            e6Var.f22891k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int iB1 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                        if (i11 != 0 || iB1 == 0) {
                            e6Var.f22892l = i11;
                        } else {
                            e6Var.f22892l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int iB2 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                        if (i11 != 0 || iB2 == 0) {
                            e6Var.f22893m = i11;
                        } else {
                            e6Var.f22893m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.g6.n1(true, false);
                    nc1Var.R.setHasChanges(nc1Var.T0(nc1Var.f40769n));
                    nc1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        e6Var.f22886e = i11;
                    } else if (i12 == 1) {
                        e6Var.f22887f = i11;
                    } else if (i12 == 2) {
                        int i14 = e6Var.f22888g;
                        e6Var.f22888g = i11;
                        if (i14 != 0 && i11 == 0) {
                            nc1Var.f40779r0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            nc1Var.f40779r0.o(0);
                            nc1Var.e1();
                        }
                    } else {
                        e6Var.h = i11;
                    }
                    int i15 = nc1Var.T;
                    if (i15 >= 0) {
                        nc1Var.G0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.g6.n1(true, true);
                    nc1Var.f40776q0.f1();
                    nc1Var.R.setHasChanges(nc1Var.T0(nc1Var.f40769n));
                    nc1Var.m1(true);
                }
                int size = nc1Var.f40750e0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) nc1Var.f40750e0.get(i16);
                    i6Var.d(nc1Var.getThemedColor(i6Var.f23517f), false, false);
                }
                nc1Var.f40763j0.f1();
                nc1Var.f40776q0.f1();
                ag.t0 t0Var = nc1Var.W;
                if (t0Var != null) {
                    t0Var.invalidate();
                }
                nc1Var.T = -1;
                break;
            case 1:
                nc1Var.presentFragment(q91.d0(nc1Var.getMessagesController().getChat(Long.valueOf(-nc1Var.F1)), true));
                break;
            case 2:
                nc1Var.l1.n1(false);
                boolean zA = nc1Var.f40735a.a();
                org.telegram.ui.Components.oi0 oi0Var = nc1Var.J1;
                oi0Var.N(zA ? oi0Var.f31312e[0] : 0);
                org.telegram.ui.Components.oi0 oi0Var2 = nc1Var.J1;
                if (oi0Var2 != null) {
                    oi0Var2.start();
                }
                nc1Var.b1(false);
                nc1Var.V0();
                nc1Var.i1();
                if (nc1Var.f40750e0 != null) {
                    for (int i17 = 0; i17 < nc1Var.f40750e0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.i6) nc1Var.f40750e0.get(i17)).d(nc1Var.getThemedColor(((org.telegram.ui.ActionBar.i6) nc1Var.f40750e0.get(i17)).f23517f), false, false);
                    }
                }
                if (nc1Var.I1) {
                    ec1 ec1Var = nc1Var.l1;
                    if (ec1Var == null || !ec1Var.a()) {
                        nc1Var.N1.a(0.0f);
                    } else {
                        nc1Var.N1.setVisibility(0);
                        nc1Var.N1.a(nc1Var.f40764j1);
                    }
                    ValueAnimator valueAnimator = nc1Var.L1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        nc1Var.L1.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(nc1Var.f40766k1, nc1Var.l1.a() ? 1.0f : 0.0f);
                    nc1Var.L1 = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new w01(nc1Var, 13));
                    nc1Var.L1.addListener(new qb1(nc1Var, 5));
                    nc1Var.L1.setDuration(250L);
                    nc1Var.L1.setInterpolator(org.telegram.ui.Components.er.f28122f);
                    nc1Var.L1.start();
                }
                break;
            default:
                if (nc1Var.getParentActivity() != null && nc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(7, nc1Var.getParentActivity(), null, true);
                    x30Var.setAlpha(0.0f);
                    x30Var.setVisibility(4);
                    x30Var.setShowingDuration(4000L);
                    nc1Var.f40757g0.addView(x30Var, h7.z5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (nc1Var.l1.a()) {
                        x30Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        x30Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    x30Var.d();
                    x30Var.f(nc1Var.K1, true);
                    x30Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
