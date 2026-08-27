package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

public final class xf implements d5.d {

    public final int f44437a;

    public final rn f44438b;

    public xf(rn rnVar, int i10) {
        this.f44437a = i10;
        this.f44438b = rnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f44437a) {
            case 0:
                this.f44438b.A1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 1:
                View view = (View) obj;
                boolean z10 = view instanceof org.telegram.ui.Cells.s1;
                rn rnVar = this.f44438b;
                if (z10) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                    s1Var.A8 = rnVar.t9();
                    s1Var.B8 = rnVar.C9();
                    boolean zB9 = rnVar.B9();
                    if (s1Var.C8 != zB9) {
                        s1Var.C8 = zB9;
                        rnVar.f42213t0.getClass();
                        int iR = RecyclerView.R(view);
                        s1Var.f25391j8 = true;
                        s1Var.forceLayout();
                        if (iR >= 0) {
                            rnVar.f42252w0.m(iR);
                        }
                    }
                    s1Var.D8 = rnVar.Q8();
                    int iR8 = rnVar.R8();
                    if (s1Var.E8 != iR8) {
                        s1Var.E8 = iR8;
                        s1Var.x4();
                        s1Var.invalidate();
                    }
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    v0Var.f25728a0 = rnVar.t9();
                    v0Var.f25739e0 = rnVar.C9();
                    rnVar.B9();
                    rnVar.Q8();
                    int iR9 = rnVar.R8();
                    if (v0Var.f25743f0 != iR9) {
                        v0Var.f25743f0 = iR9;
                        v0Var.invalidate();
                    }
                } else if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(rnVar.R8() / 2.0f);
                } else if (view instanceof org.telegram.ui.Cells.b0) {
                    view.invalidate();
                } else if (view instanceof org.telegram.ui.Cells.h0) {
                    view.invalidate();
                }
                break;
            default:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    rn rnVar2 = this.f44438b;
                    rnVar2.f42291z1 = tL_premium_boostsStatus;
                    rnVar2.getMessagesController().getBoostsController().userCanBoostChannel(rnVar2.P5, tL_premium_boostsStatus, new xf(rnVar2, 0));
                    break;
                }
                break;
        }
    }
}
