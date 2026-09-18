package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ro extends org.telegram.ui.ActionBar.j {
    public final int f37106a;
    public final Object f37107b;

    public ro(Object obj, int i10) {
        this.f37106a = i10;
        this.f37107b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        switch (this.f37106a) {
            case 0:
                uo uoVar = (uo) this.f37107b;
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
                ip ipVar = (ip) this.f37107b;
                if (i10 == -1) {
                    ipVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.pr prVar = ipVar.f34591r;
                    if (prVar == null || prVar.f27307c <= 0.0f) {
                        ipVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((up) this.f37107b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((bq) this.f37107b).finishFragment();
                    return;
                }
                return;
            case 4:
                nq nqVar = (nq) this.f37107b;
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
                sr srVar = (sr) this.f37107b;
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
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f37107b;
                if (i10 == -1) {
                    j8Var.dismiss();
                    return;
                } else {
                    j8Var.t0(i10);
                    return;
                }
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.bb) this.f37107b).dismiss();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.f37107b;
                if (i10 == -1) {
                    if (!viVar.f29082y0.i()) {
                        viVar.dismiss();
                        return;
                    }
                    return;
                }
                viVar.f29082y0.t(i10);
                return;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.b40) this.f37107b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.tf0) this.f37107b).f28380r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.ah0) this.f37107b).dismiss();
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.vq0) this.f37107b).onBackPressed();
                return;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.o61) this.f37107b).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.x0) this.f37107b).b(false, false);
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((li1) this.f37107b).a(false, false);
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((au) this.f37107b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f37107b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f37107b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((av) this.f37107b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((ov) this.f37107b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((mz) this.f37107b).finishFragment();
                    return;
                }
                return;
            case 22:
                c00 c00Var = (c00) this.f37107b;
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
                        for (int i11 = 0; i11 < c00Var.f32477a.getChildCount(); i11++) {
                            View childAt = c00Var.f32477a.getChildAt(i11);
                            c00Var.f32477a.getClass();
                            if (RecyclerView.S(childAt) == c00Var.L && (childAt instanceof org.telegram.ui.Components.z00)) {
                                int i12 = -c00Var.f32483s;
                                c00Var.f32483s = i12;
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
                f10 f10Var = (f10) this.f37107b;
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
                    ((FiltersSetupActivity) this.f37107b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((r20) this.f37107b).finishFragment();
                    return;
                }
                return;
            case 26:
                e70 e70Var = (e70) this.f37107b;
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
                    ((l70) this.f37107b).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((n70) this.f37107b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((t70) this.f37107b).finishFragment();
                    return;
                }
                return;
        }
    }
}
