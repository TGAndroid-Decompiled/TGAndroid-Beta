package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class xe implements Utilities.Callback {
    public final int f43197a;
    public final qn f43198b;

    public xe(qn qnVar, int i10) {
        this.f43197a = i10;
        this.f43198b = qnVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f43197a;
        qn qnVar = this.f43198b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                qn qnVar2 = this.f43198b;
                qnVar2.f40693g5 = messageSuggestionParams;
                qnVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                qnVar2.Db(true, null, qnVar2.p5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                qnVar.Ab(true, false);
                if (((Boolean) obj).booleanValue()) {
                    qnVar.finishFragment();
                    return;
                }
                return;
            case 2:
                qnVar.ia((String) obj, false);
                return;
            case 3:
                qnVar.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 4:
                qnVar.Ib((MessageSuggestionParams) obj);
                return;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    qnVar.D1 = tL_premium_boostsStatus;
                    qnVar.getMessagesController().getBoostsController().userCanBoostChannel(qnVar.T5, tL_premium_boostsStatus, new xe(qnVar, 3));
                    return;
                }
                return;
            case 6:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = qnVar.y9();
                    u1Var.F8 = qnVar.H9();
                    boolean G9 = qnVar.G9();
                    if (u1Var.G8 != G9) {
                        u1Var.G8 = G9;
                        qnVar.f40901x0.getClass();
                        int R = RecyclerView.R(view);
                        u1Var.f23409n8 = true;
                        u1Var.forceLayout();
                        if (R >= 0) {
                            qnVar.A0.m(R);
                        }
                    }
                    u1Var.H8 = qnVar.V8();
                    int W8 = qnVar.W8();
                    if (u1Var.I8 != W8) {
                        u1Var.I8 = W8;
                        u1Var.y4();
                        u1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    w0Var.f23692e0 = qnVar.y9();
                    w0Var.f23705i0 = qnVar.H9();
                    qnVar.G9();
                    qnVar.V8();
                    int W82 = qnVar.W8();
                    if (w0Var.f23708j0 != W82) {
                        w0Var.f23708j0 = W82;
                        w0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w1) {
                    ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(qnVar.W8() / 2.0f);
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
                org.telegram.ui.Components.s31 s31Var = qnVar.R1;
                if (s31Var != null) {
                    s31Var.m(l4.longValue(), true);
                    return;
                }
                return;
            case 8:
                ur urVar = qnVar.f40652d0;
                urVar.f42031c.add(((org.telegram.ui.ActionBar.u0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = qn.Ic;
                qnVar.Fa(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = qn.Ic;
                qnVar.Fa(intValue2);
                return;
        }
    }
}
