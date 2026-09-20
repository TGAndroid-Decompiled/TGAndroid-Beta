package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class yf1 extends org.telegram.ui.Components.ul0 {
    public final bg1 f39904c;

    public yf1(bg1 bg1Var) {
        this.f39904c = bg1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42977f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        bg1 bg1Var = this.f39904c;
        if (bg1Var.m0) {
            return 0;
        }
        return bg1Var.f32451l0;
    }

    @Override
    public final int j(int i10) {
        bg1 bg1Var = this.f39904c;
        if (i10 != bg1Var.f32448i0 && i10 != bg1Var.f32445f0) {
            if (i10 >= bg1Var.f32446g0 && i10 < bg1Var.f32447h0) {
                return 2;
            }
            if (i10 >= bg1Var.f32449j0 && i10 < bg1Var.f32450k0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        View view = c1Var.f42974a;
        bg1 bg1Var = this.f39904c;
        fg1 fg1Var = bg1Var.f32459u0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
            if (i10 == bg1Var.f32445f0) {
                w3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == bg1Var.f32448i0) {
                w3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) view;
            taVar.setTopic((TLRPC.TL_forumTopic) bg1Var.f32443d0.get(i10 - bg1Var.f32446g0));
            if (i10 != bg1Var.f32447h0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            taVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) bg1Var.f32444e0.get(i10 - bg1Var.f32449j0);
            cg1 cg1Var = (cg1) view;
            if (i10 != bg1Var.f32450k0 - 1) {
                z11 = true;
            }
            cg1Var.W4 = z11;
            i11 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = fg1Var.f33631s.findTopic(fg1Var.f33596a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            cg1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            cg1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        fg1 fg1Var = this.f39904c.f32459u0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? cg1Var = new cg1(fg1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.n2) fg1Var).inPreviewMode;
                    cg1Var.f20973k0 = z10;
                    frameLayout = cg1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.ta(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.w3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
