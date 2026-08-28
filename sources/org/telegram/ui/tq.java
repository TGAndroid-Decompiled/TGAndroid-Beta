package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class tq extends org.telegram.ui.ActionBar.j {
    public final int f43050a;
    public final Object f43051b;

    public tq(Object obj, int i9) {
        this.f43050a = i9;
        this.f43051b = obj;
    }

    @Override
    public final void b(int i9) {
        Runnable runnable;
        switch (this.f43050a) {
            case 0:
                jr jrVar = (jr) this.f43051b;
                if (i9 == -1) {
                    if (jrVar.f0(true)) {
                        jrVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    jrVar.t0();
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.f43051b;
                if (i9 == -1) {
                    c8Var.dismiss();
                    return;
                } else {
                    c8Var.s0(i9);
                    return;
                }
            case 2:
                if (i9 == -1) {
                    ((org.telegram.ui.Components.sa) this.f43051b).dismiss();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ki kiVar = (org.telegram.ui.Components.ki) this.f43051b;
                if (i9 == -1) {
                    if (!kiVar.f30160u0.i()) {
                        kiVar.dismiss();
                        return;
                    }
                    return;
                }
                kiVar.f30160u0.t(i9);
                return;
            case 4:
                if (i9 == -1) {
                    ((org.telegram.ui.Components.l30) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i9 == -1 && (runnable = ((org.telegram.ui.Components.re0) this.f43051b).f32152r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 6:
                if (i9 == -1) {
                    ((org.telegram.ui.Components.ag0) this.f43051b).dismiss();
                    return;
                }
                return;
            case 7:
                ((org.telegram.ui.Components.rp0) this.f43051b).onBackPressed();
                return;
            case 8:
                if (i9 == -1) {
                    ((org.telegram.ui.Components.d51) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i9 == -1) {
                    ((org.telegram.ui.Components.voip.u0) this.f43051b).b(false, false);
                    return;
                }
                return;
            case 10:
                if (i9 == -1) {
                    ((fh1) this.f43051b).a(false, false);
                    return;
                }
                return;
            case 11:
                if (i9 == -1) {
                    ((qt) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i9 == -1) {
                    ((DataAutoDownloadActivity) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i9 == -1) {
                    ((DataSettingsActivity) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i9 == -1) {
                    ((ou) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i9 == -1) {
                    ((bv) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i9 == -1) {
                    ((vy) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 17:
                lz lzVar = (lz) this.f43051b;
                if (i9 == -1) {
                    if (lzVar.V(true)) {
                        lzVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    if (Math.abs(lzVar.P - 1.0f) < 0.1f) {
                        lzVar.b0();
                        return;
                    } else if (Math.abs(lzVar.P - 0.5f) < 0.1f) {
                        for (int i10 = 0; i10 < lzVar.f40253a.getChildCount(); i10++) {
                            View childAt = lzVar.f40253a.getChildAt(i10);
                            lzVar.f40253a.getClass();
                            if (RecyclerView.R(childAt) == lzVar.H && (childAt instanceof org.telegram.ui.Components.k00)) {
                                int i11 = -lzVar.f40260s;
                                lzVar.f40260s = i11;
                                AndroidUtilities.shakeViewSpring(childAt, i11);
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
            case 18:
                n00 n00Var = (n00) this.f43051b;
                if (i9 == -1) {
                    if (n00Var.g0(true)) {
                        n00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    n00Var.p0();
                    return;
                } else {
                    return;
                }
            case 19:
                if (i9 == -1) {
                    ((FiltersSetupActivity) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i9 == -1) {
                    ((x10) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 21:
                k60 k60Var = (k60) this.f43051b;
                if (i9 == -1) {
                    if (k60Var.e0(true)) {
                        k60Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    k60Var.n0();
                    return;
                } else {
                    return;
                }
            case 22:
                if (i9 == -1) {
                    ((r60) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i9 == -1) {
                    ((t60) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i9 == -1) {
                    ((z60) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i9 == -1) {
                    ((b70) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i9 == -1) {
                    ((q70) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i9 == -1) {
                    ((LanguageSelectActivity) this.f43051b).finishFragment();
                    return;
                }
                return;
            case 28:
                bb0 bb0Var = (bb0) this.f43051b;
                if (i9 == -1) {
                    bb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(bb0Var.B);
                    return;
                }
                return;
            default:
                if (i9 == -1) {
                    ((sb0) this.f43051b).finishFragment();
                    return;
                }
                return;
        }
    }
}
