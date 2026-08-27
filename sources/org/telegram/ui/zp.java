package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class zp extends org.telegram.ui.ActionBar.j {

    public final int f45232a;

    public final Object f45233b;

    public zp(Object obj, int i10) {
        this.f45232a = i10;
        this.f45233b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        switch (this.f45232a) {
            case 0:
                dq dqVar = (dq) this.f45233b;
                if (i10 == -1) {
                    if (dqVar.m0(true)) {
                        dqVar.finishFragment();
                    }
                } else if (i10 == 1) {
                    dqVar.r0(true);
                }
                break;
            case 1:
                lr lrVar = (lr) this.f45233b;
                if (i10 == -1) {
                    if (lrVar.g0(true)) {
                        lrVar.finishFragment();
                    }
                } else if (i10 == 1) {
                    lrVar.u0();
                }
                break;
            case 2:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.f45233b;
                if (i10 == -1) {
                    b8Var.dismiss();
                } else {
                    b8Var.t0(i10);
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.qa) this.f45233b).dismiss();
                }
                break;
            case 4:
                org.telegram.ui.Components.gi giVar = (org.telegram.ui.Components.gi) this.f45233b;
                if (i10 != -1) {
                    giVar.f28696u0.u(i10);
                    break;
                } else if (!giVar.f28696u0.i()) {
                    giVar.dismiss();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.q30) this.f45233b).finishFragment();
                }
                break;
            case 6:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.we0) this.f45233b).f34172r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.cg0) this.f45233b).dismiss();
                }
                break;
            case 8:
                ((org.telegram.ui.Components.sp0) this.f45233b).onBackPressed();
                break;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.f51) this.f45233b).finishFragment();
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.u0) this.f45233b).b(false, false);
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((eh1) this.f45233b).a(false, false);
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((tt) this.f45233b).finishFragment();
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f45233b).finishFragment();
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f45233b).finishFragment();
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((ru) this.f45233b).finishFragment();
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((ev) this.f45233b).finishFragment();
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((yy) this.f45233b).finishFragment();
                }
                break;
            case 18:
                oz ozVar = (oz) this.f45233b;
                if (i10 == -1) {
                    if (ozVar.W(true)) {
                        ozVar.finishFragment();
                    }
                } else if (i10 == 1) {
                    if (Math.abs(ozVar.P - 1.0f) < 0.1f) {
                        ozVar.c0();
                    } else if (Math.abs(ozVar.P - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < ozVar.f41216a.getChildCount(); i11++) {
                            View childAt = ozVar.f41216a.getChildAt(i11);
                            ozVar.f41216a.getClass();
                            if (RecyclerView.R(childAt) == ozVar.H && (childAt instanceof org.telegram.ui.Components.n00)) {
                                int i12 = -ozVar.f41223s;
                                ozVar.f41223s = i12;
                                AndroidUtilities.shakeViewSpring(childAt, i12);
                            }
                        }
                    }
                }
                break;
            case 19:
                q00 q00Var = (q00) this.f45233b;
                if (i10 == -1) {
                    if (q00Var.h0(true)) {
                        q00Var.finishFragment();
                    }
                } else if (i10 == 1) {
                    q00Var.q0();
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((FiltersSetupActivity) this.f45233b).finishFragment();
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((a20) this.f45233b).finishFragment();
                }
                break;
            case 22:
                o60 o60Var = (o60) this.f45233b;
                if (i10 == -1) {
                    if (o60Var.f0(true)) {
                        o60Var.finishFragment();
                    }
                } else if (i10 == 1) {
                    o60Var.o0();
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((u60) this.f45233b).finishFragment();
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((w60) this.f45233b).finishFragment();
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((c70) this.f45233b).finishFragment();
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((e70) this.f45233b).finishFragment();
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((t70) this.f45233b).finishFragment();
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((LanguageSelectActivity) this.f45233b).finishFragment();
                }
                break;
            default:
                fb0 fb0Var = (fb0) this.f45233b;
                if (i10 == -1) {
                    fb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(fb0Var.B);
                }
                break;
        }
    }
}
