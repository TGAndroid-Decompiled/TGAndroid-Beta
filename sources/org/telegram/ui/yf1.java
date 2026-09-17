package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class yf1 extends org.telegram.ui.Components.ll0 {
    public final bg1 f39878c;

    public yf1(bg1 bg1Var) {
        this.f39878c = bg1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42700f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        bg1 bg1Var = this.f39878c;
        if (bg1Var.m0) {
            return 0;
        }
        return bg1Var.f32168l0;
    }

    @Override
    public final int j(int i10) {
        bg1 bg1Var = this.f39878c;
        if (i10 != bg1Var.f32165i0 && i10 != bg1Var.f32162f0) {
            if (i10 >= bg1Var.f32163g0 && i10 < bg1Var.f32164h0) {
                return 2;
            }
            if (i10 >= bg1Var.f32166j0 && i10 < bg1Var.f32167k0) {
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
        View view = c1Var.f42697a;
        bg1 bg1Var = this.f39878c;
        fg1 fg1Var = bg1Var.f32176u0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == bg1Var.f32162f0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == bg1Var.f32165i0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) view;
            taVar.setTopic((TLRPC.TL_forumTopic) bg1Var.f32160d0.get(i10 - bg1Var.f32163g0));
            if (i10 != bg1Var.f32164h0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            taVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) bg1Var.f32161e0.get(i10 - bg1Var.f32166j0);
            cg1 cg1Var = (cg1) view;
            if (i10 != bg1Var.f32167k0 - 1) {
                z11 = true;
            }
            cg1Var.W4 = z11;
            i11 = ((org.telegram.ui.ActionBar.o2) fg1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = fg1Var.f33671s.findTopic(fg1Var.f33636a, topicId);
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
        fg1 fg1Var = this.f39878c.f32176u0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? cg1Var = new cg1(fg1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.o2) fg1Var).inPreviewMode;
                    cg1Var.f20718k0 = z10;
                    frameLayout = cg1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.ta(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
