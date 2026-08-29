package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class uf implements f5.d {
    public final int f43250a;
    public final tn f43251b;

    public uf(tn tnVar, int i10) {
        this.f43250a = i10;
        this.f43251b = tnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f43250a) {
            case 0:
                this.f43251b.A1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z10 = view instanceof org.telegram.ui.Cells.s1;
                tn tnVar = this.f43251b;
                if (z10) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                    s1Var.A8 = tnVar.t9();
                    s1Var.B8 = tnVar.C9();
                    boolean B9 = tnVar.B9();
                    if (s1Var.C8 != B9) {
                        s1Var.C8 = B9;
                        tnVar.f42973t0.getClass();
                        int R = RecyclerView.R(view);
                        s1Var.f25402j8 = true;
                        s1Var.forceLayout();
                        if (R >= 0) {
                            tnVar.f43013w0.m(R);
                        }
                    }
                    s1Var.D8 = tnVar.Q8();
                    int R8 = tnVar.R8();
                    if (s1Var.E8 != R8) {
                        s1Var.E8 = R8;
                        s1Var.y4();
                        s1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    v0Var.f25758a0 = tnVar.t9();
                    v0Var.f25769e0 = tnVar.C9();
                    tnVar.B9();
                    tnVar.Q8();
                    int R82 = tnVar.R8();
                    if (v0Var.f25773f0 != R82) {
                        v0Var.f25773f0 = R82;
                        v0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(tnVar.R8() / 2.0f);
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
            default:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    tn tnVar2 = this.f43251b;
                    tnVar2.f43051z1 = tL_premium_boostsStatus;
                    tnVar2.getMessagesController().getBoostsController().userCanBoostChannel(tnVar2.P5, tL_premium_boostsStatus, new uf(tnVar2, 0));
                    return;
                }
                return;
        }
    }
}
