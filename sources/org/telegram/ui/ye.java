package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class ye implements Utilities.Callback {
    public final int f45979a;
    public final wn f45980b;

    public ye(wn wnVar, int i10) {
        this.f45979a = i10;
        this.f45980b = wnVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f45979a;
        wn wnVar = this.f45980b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                wn wnVar2 = this.f45980b;
                wnVar2.f45330w5 = messageSuggestionParams;
                wnVar2.F5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                wnVar2.Pb(true, null, wnVar2.F5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                wnVar.Tb((MessageSuggestionParams) obj);
                return;
            case 2:
                wnVar.Kb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    wnVar.finishFragment();
                    return;
                }
                return;
            case 3:
                wnVar.qa((String) obj, false);
                return;
            case 4:
                wnVar.Q1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    wnVar.P1 = tL_premium_boostsStatus;
                    wnVar.getMessagesController().getBoostsController().userCanBoostChannel(wnVar.f45168j6, tL_premium_boostsStatus, new ye(wnVar, 4));
                    return;
                }
                return;
            case 6:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                    s1Var.E8 = wnVar.E9();
                    s1Var.F8 = wnVar.O9();
                    boolean N9 = wnVar.N9();
                    if (s1Var.G8 != N9) {
                        s1Var.G8 = N9;
                        wnVar.f45339x0.getClass();
                        int R = RecyclerView.R(view);
                        s1Var.f25208n8 = true;
                        s1Var.forceLayout();
                        if (R >= 0) {
                            wnVar.A0.m(R);
                        }
                    }
                    s1Var.H8 = wnVar.d9();
                    int e92 = wnVar.e9();
                    if (s1Var.I8 != e92) {
                        s1Var.I8 = e92;
                        s1Var.A4();
                        s1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    v0Var.f25513e0 = wnVar.E9();
                    v0Var.f25526i0 = wnVar.O9();
                    wnVar.N9();
                    wnVar.d9();
                    int e93 = wnVar.e9();
                    if (v0Var.f25529j0 != e93) {
                        v0Var.f25529j0 = e93;
                        v0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(wnVar.e9() / 2.0f);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.a0) {
                    view.invalidate();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.g0) {
                    view.invalidate();
                    return;
                } else {
                    return;
                }
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.f41 f41Var = wnVar.f45089d2;
                if (f41Var != null) {
                    f41Var.n(l4.longValue(), true);
                    return;
                }
                return;
            case 8:
                as asVar = wnVar.f45087d0;
                asVar.f37815c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = wn.f45035fd;
                wnVar.Na(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = wn.f45035fd;
                wnVar.Na(intValue2);
                return;
        }
    }
}
