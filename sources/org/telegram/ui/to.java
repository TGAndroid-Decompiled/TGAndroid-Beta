package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class to extends org.telegram.ui.ActionBar.j {
    public final int f37840a;
    public final Object f37841b;

    public to(Object obj, int i10) {
        this.f37840a = i10;
        this.f37841b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        switch (this.f37840a) {
            case 0:
                wo woVar = (wo) this.f37841b;
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
                kp kpVar = (kp) this.f37841b;
                if (i10 == -1) {
                    kpVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.pr prVar = kpVar.f35338r;
                    if (prVar == null || prVar.f27117c <= 0.0f) {
                        kpVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((wp) this.f37841b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((dq) this.f37841b).finishFragment();
                    return;
                }
                return;
            case 4:
                pq pqVar = (pq) this.f37841b;
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
                ur urVar = (ur) this.f37841b;
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
                org.telegram.ui.Components.h8 h8Var = (org.telegram.ui.Components.h8) this.f37841b;
                if (i10 == -1) {
                    h8Var.dismiss();
                    return;
                } else {
                    h8Var.t0(i10);
                    return;
                }
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.za) this.f37841b).dismiss();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.f37841b;
                if (i10 == -1) {
                    if (!viVar.f28803y0.i()) {
                        viVar.dismiss();
                        return;
                    }
                    return;
                }
                viVar.f28803y0.t(i10);
                return;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.b40) this.f37841b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.kf0) this.f37841b).f25626r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.qg0) this.f37841b).dismiss();
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.iq0) this.f37841b).onBackPressed();
                return;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.a61) this.f37841b).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.x0) this.f37841b).b(false, false);
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((mi1) this.f37841b).a(false, false);
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((cu) this.f37841b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f37841b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f37841b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((bv) this.f37841b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((pv) this.f37841b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((oz) this.f37841b).finishFragment();
                    return;
                }
                return;
            case 22:
                e00 e00Var = (e00) this.f37841b;
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
                        for (int i11 = 0; i11 < e00Var.f33245a.getChildCount(); i11++) {
                            View childAt = e00Var.f33245a.getChildAt(i11);
                            e00Var.f33245a.getClass();
                            if (RecyclerView.S(childAt) == e00Var.L && (childAt instanceof org.telegram.ui.Components.z00)) {
                                int i12 = -e00Var.f33251s;
                                e00Var.f33251s = i12;
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
                h10 h10Var = (h10) this.f37841b;
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
                    ((FiltersSetupActivity) this.f37841b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((t20) this.f37841b).finishFragment();
                    return;
                }
                return;
            case 26:
                g70 g70Var = (g70) this.f37841b;
                if (i10 == -1) {
                    if (g70Var.f0(true)) {
                        g70Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    g70Var.o0();
                    return;
                } else {
                    return;
                }
            case 27:
                if (i10 == -1) {
                    ((n70) this.f37841b).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((p70) this.f37841b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((v70) this.f37841b).finishFragment();
                    return;
                }
                return;
        }
    }
}
