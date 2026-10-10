package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class yf1 extends org.telegram.ui.Components.qm0 {
    public final bg1 f44381c;

    public yf1(bg1 bg1Var) {
        this.f44381c = bg1Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47706f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        bg1 bg1Var = this.f44381c;
        if (bg1Var.f36368l0) {
            return 0;
        }
        return bg1Var.f36367k0;
    }

    @Override
    public final int j(int i10) {
        bg1 bg1Var = this.f44381c;
        if (i10 != bg1Var.f36364h0 && i10 != bg1Var.f36361e0) {
            if (i10 >= bg1Var.f36362f0 && i10 < bg1Var.f36363g0) {
                return 2;
            }
            if (i10 >= bg1Var.f36365i0 && i10 < bg1Var.f36366j0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        boolean z10;
        View view = d1Var.f47702a;
        bg1 bg1Var = this.f44381c;
        fg1 fg1Var = bg1Var.f36375t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == bg1Var.f36361e0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == bg1Var.f36364h0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
            qaVar.setTopic((TLRPC.TL_forumTopic) bg1Var.f36359c0.get(i10 - bg1Var.f36362f0));
            if (i10 != bg1Var.f36363g0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            qaVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) bg1Var.f36360d0.get(i10 - bg1Var.f36365i0);
            cg1 cg1Var = (cg1) view;
            if (i10 != bg1Var.f36366j0 - 1) {
                z11 = true;
            }
            cg1Var.f36701a5 = z11;
            i11 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = fg1Var.f37638s.findTopic(fg1Var.f37602a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            cg1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            cg1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        fg1 fg1Var = this.f44381c.f36375t0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? cg1Var = new cg1(fg1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.n2) fg1Var).inPreviewMode;
                    cg1Var.f22819k0 = z10;
                    frameLayout = cg1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.qa(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(frameLayout);
    }
}
