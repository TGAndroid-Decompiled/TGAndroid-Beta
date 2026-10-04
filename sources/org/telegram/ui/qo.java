package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class qo extends org.telegram.ui.ActionBar.j {
    public final int f39759a;
    public final Object f39760b;

    public qo(Object obj, int i10) {
        this.f39759a = i10;
        this.f39760b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        switch (this.f39759a) {
            case 0:
                to toVar = (to) this.f39760b;
                if (i10 == -1) {
                    if (toVar.e0(true)) {
                        toVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    toVar.j0();
                    return;
                } else {
                    return;
                }
            case 1:
                hp hpVar = (hp) this.f39760b;
                if (i10 == -1) {
                    hpVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.sr srVar = hpVar.f37147r;
                    if (srVar == null || srVar.f30864c <= 0.0f) {
                        hpVar.X();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((tp) this.f39760b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((aq) this.f39760b).finishFragment();
                    return;
                }
                return;
            case 4:
                mq mqVar = (mq) this.f39760b;
                if (i10 == -1) {
                    if (mqVar.m0(true)) {
                        mqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    mqVar.r0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                rr rrVar = (rr) this.f39760b;
                if (i10 == -1) {
                    if (rrVar.g0(true)) {
                        rrVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    rrVar.u0();
                    return;
                } else {
                    return;
                }
            case 6:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f39760b;
                if (i10 == -1) {
                    j8Var.dismiss();
                    return;
                } else {
                    j8Var.t0(i10);
                    return;
                }
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.cb) this.f39760b).dismiss();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.xi xiVar = (org.telegram.ui.Components.xi) this.f39760b;
                if (i10 == -1) {
                    if (!xiVar.f32874y0.i()) {
                        xiVar.dismiss();
                        return;
                    }
                    return;
                }
                xiVar.f32874y0.t(i10);
                return;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.f40) this.f39760b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.wf0) this.f39760b).f32531r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.ch0) this.f39760b).dismiss();
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.zq0) this.f39760b).onBackPressed();
                return;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.x61) this.f39760b).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.x0) this.f39760b).b(false, false);
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((fi1) this.f39760b).a(false, false);
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((zt) this.f39760b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f39760b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f39760b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((zu) this.f39760b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((nv) this.f39760b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((mz) this.f39760b).finishFragment();
                    return;
                }
                return;
            case 22:
                c00 c00Var = (c00) this.f39760b;
                if (i10 == -1) {
                    if (c00Var.U(true)) {
                        c00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(c00Var.T - 1.0f) < 0.1f) {
                        c00Var.c0();
                        return;
                    } else if (Math.abs(c00Var.T - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < c00Var.f35224a.getChildCount(); i11++) {
                            View childAt = c00Var.f35224a.getChildAt(i11);
                            c00Var.f35224a.getClass();
                            if (RecyclerView.R(childAt) == c00Var.L && (childAt instanceof org.telegram.ui.Components.c10)) {
                                int i12 = -c00Var.f35231s;
                                c00Var.f35231s = i12;
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
                f10 f10Var = (f10) this.f39760b;
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
                    ((FiltersSetupActivity) this.f39760b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((r20) this.f39760b).finishFragment();
                    return;
                }
                return;
            case 26:
                d70 d70Var = (d70) this.f39760b;
                if (i10 == -1) {
                    if (d70Var.f0(true)) {
                        d70Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    d70Var.o0();
                    return;
                } else {
                    return;
                }
            case 27:
                if (i10 == -1) {
                    ((k70) this.f39760b).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((m70) this.f39760b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((s70) this.f39760b).finishFragment();
                    return;
                }
                return;
        }
    }
}
