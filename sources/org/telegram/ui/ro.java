package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ro extends org.telegram.ui.ActionBar.j {
    public final int f41463a;
    public final Object f41464b;

    public ro(Object obj, int i10) {
        this.f41463a = i10;
        this.f41464b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        switch (this.f41463a) {
            case 0:
                uo uoVar = (uo) this.f41464b;
                if (i10 == -1) {
                    if (uoVar.e0(true)) {
                        uoVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    uoVar.j0();
                    return;
                } else {
                    return;
                }
            case 1:
                ip ipVar = (ip) this.f41464b;
                if (i10 == -1) {
                    ipVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.gs gsVar = ipVar.f38730r;
                    if (gsVar == null || gsVar.f26867c <= 0.0f) {
                        ipVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((up) this.f41464b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((bq) this.f41464b).finishFragment();
                    return;
                }
                return;
            case 4:
                nq nqVar = (nq) this.f41464b;
                if (i10 == -1) {
                    if (nqVar.m0(true)) {
                        nqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    nqVar.r0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                tr trVar = (tr) this.f41464b;
                if (i10 == -1) {
                    if (trVar.g0(true)) {
                        trVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    trVar.u0();
                    return;
                } else {
                    return;
                }
            case 6:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.f41464b;
                if (i10 == -1) {
                    l8Var.dismiss();
                    return;
                } else {
                    l8Var.u0(i10);
                    return;
                }
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.eb) this.f41464b).dismiss();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.yi yiVar = (org.telegram.ui.Components.yi) this.f41464b;
                if (i10 == -1) {
                    if (!yiVar.B0.j()) {
                        yiVar.dismiss();
                        return;
                    }
                    return;
                }
                yiVar.B0.w(i10);
                return;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.s40) this.f41464b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.lg0) this.f41464b).f28458r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.sh0) this.f41464b).dismiss();
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.mr0) this.f41464b).onBackPressed();
                return;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.f71) this.f41464b).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.x0) this.f41464b).b(false, false);
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((pi1) this.f41464b).a(false, false);
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((zt) this.f41464b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f41464b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f41464b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((yu) this.f41464b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((mv) this.f41464b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((lz) this.f41464b).finishFragment();
                    return;
                }
                return;
            case 22:
                c00 c00Var = (c00) this.f41464b;
                if (i10 == -1) {
                    if (c00Var.W(true)) {
                        c00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(c00Var.T - 1.0f) < 0.1f) {
                        c00Var.c0();
                        return;
                    } else if (Math.abs(c00Var.T - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < c00Var.f36473a.getChildCount(); i11++) {
                            View childAt = c00Var.f36473a.getChildAt(i11);
                            c00Var.f36473a.getClass();
                            if (RecyclerView.R(childAt) == c00Var.L && (childAt instanceof org.telegram.ui.Components.p10)) {
                                int i12 = -c00Var.f36480s;
                                c00Var.f36480s = i12;
                                AndroidUtilities.shakeViewSpring(childAt, i12);
                                return;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 23:
                f10 f10Var = (f10) this.f41464b;
                if (i10 == -1) {
                    if (f10Var.h0(true)) {
                        f10Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    f10Var.q0();
                    return;
                } else {
                    return;
                }
            case 24:
                if (i10 == -1) {
                    ((FiltersSetupActivity) this.f41464b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((p20) this.f41464b).finishFragment();
                    return;
                }
                return;
            case 26:
                c70 c70Var = (c70) this.f41464b;
                if (i10 == -1) {
                    if (c70Var.f0(true)) {
                        c70Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    c70Var.o0();
                    return;
                } else {
                    return;
                }
            case 27:
                if (i10 == -1) {
                    ((j70) this.f41464b).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((l70) this.f41464b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((s70) this.f41464b).finishFragment();
                    return;
                }
                return;
        }
    }
}
