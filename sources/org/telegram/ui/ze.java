package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class ze implements Utilities.Callback {
    public final int f43717a;
    public final sn f43718b;

    public ze(sn snVar, int i10) {
        this.f43717a = i10;
        this.f43718b = snVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f43717a;
        sn snVar = this.f43718b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                sn snVar2 = this.f43718b;
                snVar2.f41211g5 = messageSuggestionParams;
                snVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                snVar2.Cb(true, null, snVar2.p5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                snVar.zb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    snVar.finishFragment();
                    return;
                }
                return;
            case 2:
                snVar.ia((String) obj, false);
                return;
            case 3:
                snVar.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 4:
                snVar.Hb((MessageSuggestionParams) obj);
                return;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    snVar.D1 = tL_premium_boostsStatus;
                    snVar.getMessagesController().getBoostsController().userCanBoostChannel(snVar.T5, tL_premium_boostsStatus, new ze(snVar, 3));
                    return;
                }
                return;
            case 6:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = snVar.y9();
                    u1Var.F8 = snVar.H9();
                    boolean G9 = snVar.G9();
                    if (u1Var.G8 != G9) {
                        u1Var.G8 = G9;
                        snVar.f41419x0.getClass();
                        int R = RecyclerView.R(view);
                        u1Var.f23405n8 = true;
                        u1Var.forceLayout();
                        if (R >= 0) {
                            snVar.A0.m(R);
                        }
                    }
                    u1Var.H8 = snVar.V8();
                    int W8 = snVar.W8();
                    if (u1Var.I8 != W8) {
                        u1Var.I8 = W8;
                        u1Var.y4();
                        u1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    w0Var.f23688e0 = snVar.y9();
                    w0Var.f23701i0 = snVar.H9();
                    snVar.G9();
                    snVar.V8();
                    int W82 = snVar.W8();
                    if (w0Var.f23704j0 != W82) {
                        w0Var.f23704j0 = W82;
                        w0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w1) {
                    ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(snVar.W8() / 2.0f);
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
                org.telegram.ui.Components.q31 q31Var = snVar.R1;
                if (q31Var != null) {
                    q31Var.m(l4.longValue(), true);
                    return;
                }
                return;
            case 8:
                wr wrVar = snVar.f41170d0;
                wrVar.f42897c.add(((org.telegram.ui.ActionBar.u0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = sn.Ic;
                snVar.Fa(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = sn.Ic;
                snVar.Fa(intValue2);
                return;
        }
    }
}
