package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class xe implements Utilities.Callback {
    public final int f43586a;
    public final sn f43587b;

    public xe(sn snVar, int i10) {
        this.f43586a = i10;
        this.f43587b = snVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f43586a;
        sn snVar = this.f43587b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                sn snVar2 = this.f43587b;
                snVar2.f41677s5 = messageSuggestionParams;
                snVar2.B5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                snVar2.Eb(true, null, snVar2.B5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                snVar.Bb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    snVar.finishFragment();
                    return;
                }
                return;
            case 2:
                snVar.ia((String) obj, false);
                return;
            case 3:
                snVar.Q1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 4:
                snVar.Jb((MessageSuggestionParams) obj);
                return;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    snVar.P1 = tL_premium_boostsStatus;
                    snVar.getMessagesController().getBoostsController().userCanBoostChannel(snVar.f41519f6, tL_premium_boostsStatus, new xe(snVar, 3));
                    return;
                }
                return;
            case 6:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    t1Var.E8 = snVar.y9();
                    t1Var.F8 = snVar.H9();
                    boolean G9 = snVar.G9();
                    if (t1Var.G8 != G9) {
                        t1Var.G8 = G9;
                        snVar.f41737x0.getClass();
                        int R = RecyclerView.R(view);
                        t1Var.f23500n8 = true;
                        t1Var.forceLayout();
                        if (R >= 0) {
                            snVar.A0.m(R);
                        }
                    }
                    t1Var.H8 = snVar.V8();
                    int W8 = snVar.W8();
                    if (t1Var.I8 != W8) {
                        t1Var.I8 = W8;
                        t1Var.x4();
                        t1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    v0Var.f23766e0 = snVar.y9();
                    v0Var.f23779i0 = snVar.H9();
                    snVar.G9();
                    snVar.V8();
                    int W82 = snVar.W8();
                    if (v0Var.f23782j0 != W82) {
                        v0Var.f23782j0 = W82;
                        v0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v1) {
                    ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(snVar.W8() / 2.0f);
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
                org.telegram.ui.Components.w31 w31Var = snVar.f41490d2;
                if (w31Var != null) {
                    w31Var.n(l4.longValue(), true);
                    return;
                }
                return;
            case 8:
                wr wrVar = snVar.f41488d0;
                wrVar.f43424c.add(((org.telegram.ui.ActionBar.u0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = sn.Vc;
                snVar.Fa(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = sn.Vc;
                snVar.Fa(intValue2);
                return;
        }
    }
}
