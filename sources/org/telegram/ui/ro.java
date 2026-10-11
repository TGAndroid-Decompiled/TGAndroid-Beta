package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ro extends org.telegram.ui.ActionBar.j {
    public final int f41514a;
    public final Object f41515b;

    public ro(Object obj, int i10) {
        this.f41514a = i10;
        this.f41515b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        switch (this.f41514a) {
            case 0:
                uo uoVar = (uo) this.f41515b;
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
                ip ipVar = (ip) this.f41515b;
                if (i10 == -1) {
                    ipVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.hs hsVar = ipVar.f38791r;
                    if (hsVar == null || hsVar.f27225c <= 0.0f) {
                        ipVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((up) this.f41515b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((bq) this.f41515b).finishFragment();
                    return;
                }
                return;
            case 4:
                nq nqVar = (nq) this.f41515b;
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
                sr srVar = (sr) this.f41515b;
                if (i10 == -1) {
                    if (srVar.g0(true)) {
                        srVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    srVar.u0();
                    return;
                } else {
                    return;
                }
            case 6:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.f41515b;
                if (i10 == -1) {
                    l8Var.dismiss();
                    return;
                } else {
                    l8Var.u0(i10);
                    return;
                }
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.db) this.f41515b).dismiss();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.yi yiVar = (org.telegram.ui.Components.yi) this.f41515b;
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
                    ((org.telegram.ui.Components.t40) this.f41515b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.mg0) this.f41515b).f28855r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.th0) this.f41515b).dismiss();
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.nr0) this.f41515b).onBackPressed();
                return;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.g71) this.f41515b).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.y0) this.f41515b).b(false, false);
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((ni1) this.f41515b).a(false, false);
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((yt) this.f41515b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f41515b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f41515b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((xu) this.f41515b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((lv) this.f41515b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((kz) this.f41515b).finishFragment();
                    return;
                }
                return;
            case 22:
                b00 b00Var = (b00) this.f41515b;
                if (i10 == -1) {
                    if (b00Var.W(true)) {
                        b00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(b00Var.T - 1.0f) < 0.1f) {
                        b00Var.c0();
                        return;
                    } else if (Math.abs(b00Var.T - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < b00Var.f36251a.getChildCount(); i11++) {
                            View childAt = b00Var.f36251a.getChildAt(i11);
                            b00Var.f36251a.getClass();
                            if (RecyclerView.R(childAt) == b00Var.L && (childAt instanceof org.telegram.ui.Components.q10)) {
                                int i12 = -b00Var.f36258s;
                                b00Var.f36258s = i12;
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
                e10 e10Var = (e10) this.f41515b;
                if (i10 == -1) {
                    if (e10Var.h0(true)) {
                        e10Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    e10Var.q0();
                    return;
                } else {
                    return;
                }
            case 24:
                if (i10 == -1) {
                    ((FiltersSetupActivity) this.f41515b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((o20) this.f41515b).finishFragment();
                    return;
                }
                return;
            case 26:
                c70 c70Var = (c70) this.f41515b;
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
                    ((j70) this.f41515b).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((l70) this.f41515b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((s70) this.f41515b).finishFragment();
                    return;
                }
                return;
        }
    }
}
