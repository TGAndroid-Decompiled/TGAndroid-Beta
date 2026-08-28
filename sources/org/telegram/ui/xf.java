package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class xf implements d5.d {
    public final int f44509a;
    public final qn f44510b;

    public xf(qn qnVar, int i9) {
        this.f44509a = i9;
        this.f44510b = qnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f44509a) {
            case 0:
                this.f44510b.A1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z10 = view instanceof org.telegram.ui.Cells.t1;
                qn qnVar = this.f44510b;
                if (z10) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    t1Var.A8 = qnVar.t9();
                    t1Var.B8 = qnVar.C9();
                    boolean B9 = qnVar.B9();
                    if (t1Var.C8 != B9) {
                        t1Var.C8 = B9;
                        qnVar.f42077t0.getClass();
                        int R = RecyclerView.R(view);
                        t1Var.f25438j8 = true;
                        t1Var.forceLayout();
                        if (R >= 0) {
                            qnVar.f42114w0.m(R);
                        }
                    }
                    t1Var.D8 = qnVar.Q8();
                    int R8 = qnVar.R8();
                    if (t1Var.E8 != R8) {
                        t1Var.E8 = R8;
                        t1Var.y4();
                        t1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    w0Var.f25825a0 = qnVar.t9();
                    w0Var.f25836e0 = qnVar.C9();
                    qnVar.B9();
                    qnVar.Q8();
                    int R82 = qnVar.R8();
                    if (w0Var.f25840f0 != R82) {
                        w0Var.f25840f0 = R82;
                        w0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v1) {
                    ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(qnVar.R8() / 2.0f);
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
                    qn qnVar2 = this.f44510b;
                    qnVar2.f42154z1 = tL_premium_boostsStatus;
                    qnVar2.getMessagesController().getBoostsController().userCanBoostChannel(qnVar2.P5, tL_premium_boostsStatus, new xf(qnVar2, 0));
                    return;
                }
                return;
        }
    }
}
