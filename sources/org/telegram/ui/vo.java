package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class vo extends org.telegram.ui.ActionBar.k {
    public final int f37595a;
    public final Object f37596b;

    public vo(Object obj, int i10) {
        this.f37595a = i10;
        this.f37596b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        switch (this.f37595a) {
            case 0:
                yo yoVar = (yo) this.f37596b;
                if (i10 == -1) {
                    if (yoVar.e0(true)) {
                        yoVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    yoVar.j0();
                    return;
                } else {
                    return;
                }
            case 1:
                mp mpVar = (mp) this.f37596b;
                if (i10 == -1) {
                    mpVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.vr vrVar = mpVar.f35036r;
                    if (vrVar == null || vrVar.f28591c <= 0.0f) {
                        mpVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((yp) this.f37596b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((fq) this.f37596b).finishFragment();
                    return;
                }
                return;
            case 4:
                rq rqVar = (rq) this.f37596b;
                if (i10 == -1) {
                    if (rqVar.m0(true)) {
                        rqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    rqVar.r0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                wr wrVar = (wr) this.f37596b;
                if (i10 == -1) {
                    if (wrVar.g0(true)) {
                        wrVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    wrVar.u0();
                    return;
                } else {
                    return;
                }
            case 6:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f37596b;
                if (i10 == -1) {
                    j8Var.dismiss();
                    return;
                } else {
                    j8Var.t0(i10);
                    return;
                }
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.ab) this.f37596b).dismiss();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.yi yiVar = (org.telegram.ui.Components.yi) this.f37596b;
                if (i10 == -1) {
                    if (!yiVar.f29427y0.i()) {
                        yiVar.dismiss();
                        return;
                    }
                    return;
                }
                yiVar.f29427y0.t(i10);
                return;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.l40) this.f37596b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.tf0) this.f37596b).f27407r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.zg0) this.f37596b).dismiss();
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.sq0) this.f37596b).onBackPressed();
                return;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.m61) this.f37596b).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.w0) this.f37596b).b(false, false);
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((si1) this.f37596b).a(false, false);
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((bu) this.f37596b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f37596b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f37596b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((bv) this.f37596b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((pv) this.f37596b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((oz) this.f37596b).finishFragment();
                    return;
                }
                return;
            case 22:
                e00 e00Var = (e00) this.f37596b;
                if (i10 == -1) {
                    if (e00Var.W(true)) {
                        e00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(e00Var.T - 1.0f) < 0.1f) {
                        e00Var.c0();
                        return;
                    } else if (Math.abs(e00Var.T - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < e00Var.f32002a.getChildCount(); i11++) {
                            View childAt = e00Var.f32002a.getChildAt(i11);
                            e00Var.f32002a.getClass();
                            if (RecyclerView.R(childAt) == e00Var.L && (childAt instanceof org.telegram.ui.Components.h10)) {
                                int i12 = -e00Var.f32008s;
                                e00Var.f32008s = i12;
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
                h10 h10Var = (h10) this.f37596b;
                if (i10 == -1) {
                    if (h10Var.h0(true)) {
                        h10Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    h10Var.q0();
                    return;
                } else {
                    return;
                }
            case 24:
                if (i10 == -1) {
                    ((FiltersSetupActivity) this.f37596b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((s20) this.f37596b).finishFragment();
                    return;
                }
                return;
            case 26:
                e70 e70Var = (e70) this.f37596b;
                if (i10 == -1) {
                    if (e70Var.f0(true)) {
                        e70Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    e70Var.o0();
                    return;
                } else {
                    return;
                }
            case 27:
                if (i10 == -1) {
                    ((k70) this.f37596b).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((m70) this.f37596b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((s70) this.f37596b).finishFragment();
                    return;
                }
                return;
        }
    }
}
