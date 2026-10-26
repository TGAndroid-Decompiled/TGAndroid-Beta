package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class ye implements Utilities.Callback {
    public final int f46047a;
    public final un f46048b;

    public ye(un unVar, int i10) {
        this.f46047a = i10;
        this.f46048b = unVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f46047a;
        un unVar = this.f46048b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                un unVar2 = this.f46048b;
                unVar2.f44410s5 = messageSuggestionParams;
                unVar2.B5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                unVar2.Lb(true, null, unVar2.B5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                unVar.Pb((MessageSuggestionParams) obj);
                return;
            case 2:
                unVar.Gb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    unVar.finishFragment();
                    return;
                }
                return;
            case 3:
                unVar.Q1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 4:
                unVar.na((String) obj, false);
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                    s1Var.E8 = unVar.B9();
                    s1Var.F8 = unVar.L9();
                    boolean K9 = unVar.K9();
                    if (s1Var.G8 != K9) {
                        s1Var.G8 = K9;
                        unVar.f44471x0.getClass();
                        int R = RecyclerView.R(view);
                        s1Var.f25206n8 = true;
                        s1Var.forceLayout();
                        if (R >= 0) {
                            unVar.A0.m(R);
                        }
                    }
                    s1Var.H8 = unVar.a9();
                    int b92 = unVar.b9();
                    if (s1Var.I8 != b92) {
                        s1Var.I8 = b92;
                        s1Var.A4();
                        s1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    v0Var.f25511e0 = unVar.B9();
                    v0Var.f25524i0 = unVar.L9();
                    unVar.K9();
                    unVar.a9();
                    int b93 = unVar.b9();
                    if (v0Var.f25527j0 != b93) {
                        v0Var.f25527j0 = b93;
                        v0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(unVar.b9() / 2.0f);
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
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    unVar.P1 = tL_premium_boostsStatus;
                    unVar.getMessagesController().getBoostsController().userCanBoostChannel(unVar.f44252f6, tL_premium_boostsStatus, new ye(unVar, 3));
                    return;
                }
                return;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.e41 e41Var = unVar.f44222d2;
                if (e41Var != null) {
                    e41Var.n(l4.longValue(), true);
                    return;
                }
                return;
            case 8:
                yr yrVar = unVar.f44220d0;
                yrVar.f46098c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = un.f44171bd;
                unVar.Ka(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = un.f44171bd;
                unVar.Ka(intValue2);
                return;
        }
    }
}
