package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class xe implements Utilities.Callback {
    public final int f42896a;
    public final yn f42897b;

    public xe(yn ynVar, int i10) {
        this.f42896a = i10;
        this.f42897b = ynVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f42896a;
        yn ynVar = this.f42897b;
        switch (i10) {
            case 0:
                ynVar.ub(true, false);
                if (((Boolean) obj).booleanValue()) {
                    ynVar.finishFragment();
                    return;
                }
                return;
            case 1:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                yn ynVar2 = this.f42897b;
                ynVar2.f43321e5 = messageSuggestionParams;
                ynVar2.f43431n5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                ynVar2.xb(true, null, ynVar2.f43431n5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 2:
                ynVar.ca((String) obj, false);
                return;
            case 3:
                ynVar.Cb((MessageSuggestionParams) obj);
                return;
            case 4:
                ynVar.C1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    ynVar.B1 = tL_premium_boostsStatus;
                    ynVar.getMessagesController().getBoostsController().userCanBoostChannel(ynVar.R5, tL_premium_boostsStatus, new xe(ynVar, 4));
                    return;
                }
                return;
            case 6:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = ynVar.s9();
                    u1Var.F8 = ynVar.B9();
                    boolean A9 = ynVar.A9();
                    if (u1Var.G8 != A9) {
                        u1Var.G8 = A9;
                        ynVar.f43526v0.getClass();
                        int R = RecyclerView.R(view);
                        u1Var.f23319n8 = true;
                        u1Var.forceLayout();
                        if (R >= 0) {
                            ynVar.f43565y0.m(R);
                        }
                    }
                    u1Var.H8 = ynVar.R8();
                    int S8 = ynVar.S8();
                    if (u1Var.I8 != S8) {
                        u1Var.I8 = S8;
                        u1Var.y4();
                        u1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    w0Var.f23610e0 = ynVar.s9();
                    w0Var.f23623i0 = ynVar.B9();
                    ynVar.A9();
                    ynVar.R8();
                    int S82 = ynVar.S8();
                    if (w0Var.f23626j0 != S82) {
                        w0Var.f23626j0 = S82;
                        w0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w1) {
                    ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(ynVar.S8() / 2.0f);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.b0) {
                    view.invalidate();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h0) {
                    view.invalidate();
                    return;
                } else {
                    return;
                }
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.w31 w31Var = ynVar.P1;
                if (w31Var != null) {
                    w31Var.m(l4.longValue(), true);
                    return;
                }
                return;
            case 8:
                fs fsVar = ynVar.f43276b0;
                fsVar.f36391c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = yn.Bc;
                ynVar.Aa(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = yn.Bc;
                ynVar.Aa(intValue2);
                return;
        }
    }
}
