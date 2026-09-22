package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class to extends org.telegram.ui.ActionBar.j {
    public final int f37706a;
    public final Object f37707b;

    public to(Object obj, int i10) {
        this.f37706a = i10;
        this.f37707b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        switch (this.f37706a) {
            case 0:
                wo woVar = (wo) this.f37707b;
                if (i10 == -1) {
                    if (woVar.e0(true)) {
                        woVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    woVar.j0();
                    return;
                } else {
                    return;
                }
            case 1:
                kp kpVar = (kp) this.f37707b;
                if (i10 == -1) {
                    kpVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.pr prVar = kpVar.f35224r;
                    if (prVar == null || prVar.f27129c <= 0.0f) {
                        kpVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((wp) this.f37707b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((dq) this.f37707b).finishFragment();
                    return;
                }
                return;
            case 4:
                pq pqVar = (pq) this.f37707b;
                if (i10 == -1) {
                    if (pqVar.m0(true)) {
                        pqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    pqVar.r0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                ur urVar = (ur) this.f37707b;
                if (i10 == -1) {
                    if (urVar.g0(true)) {
                        urVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    urVar.u0();
                    return;
                } else {
                    return;
                }
            case 6:
                org.telegram.ui.Components.h8 h8Var = (org.telegram.ui.Components.h8) this.f37707b;
                if (i10 == -1) {
                    h8Var.dismiss();
                    return;
                } else {
                    h8Var.t0(i10);
                    return;
                }
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.za) this.f37707b).dismiss();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.f37707b;
                if (i10 == -1) {
                    if (!viVar.f28808y0.i()) {
                        viVar.dismiss();
                        return;
                    }
                    return;
                }
                viVar.f28808y0.t(i10);
                return;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.b40) this.f37707b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.kf0) this.f37707b).f25598r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.pg0) this.f37707b).dismiss();
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.hq0) this.f37707b).onBackPressed();
                return;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.z51) this.f37707b).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.x0) this.f37707b).b(false, false);
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((ni1) this.f37707b).a(false, false);
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((au) this.f37707b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f37707b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f37707b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((zu) this.f37707b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((nv) this.f37707b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((mz) this.f37707b).finishFragment();
                    return;
                }
                return;
            case 22:
                c00 c00Var = (c00) this.f37707b;
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
                        for (int i11 = 0; i11 < c00Var.f32599a.getChildCount(); i11++) {
                            View childAt = c00Var.f32599a.getChildAt(i11);
                            c00Var.f32599a.getClass();
                            if (RecyclerView.R(childAt) == c00Var.L && (childAt instanceof org.telegram.ui.Components.z00)) {
                                int i12 = -c00Var.f32605s;
                                c00Var.f32605s = i12;
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
                f10 f10Var = (f10) this.f37707b;
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
                    ((FiltersSetupActivity) this.f37707b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((r20) this.f37707b).finishFragment();
                    return;
                }
                return;
            case 26:
                e70 e70Var = (e70) this.f37707b;
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
                    ((l70) this.f37707b).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((n70) this.f37707b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((t70) this.f37707b).finishFragment();
                    return;
                }
                return;
        }
    }
}
