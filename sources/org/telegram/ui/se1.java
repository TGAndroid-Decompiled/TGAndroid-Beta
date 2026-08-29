package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class se1 extends org.telegram.ui.Components.il0 {
    public final ve1 f42367c;

    public se1(ve1 ve1Var) {
        this.f42367c = ve1Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ve1 ve1Var = this.f42367c;
        if (ve1Var.f43567h0) {
            return 0;
        }
        return ve1Var.f43566g0;
    }

    @Override
    public final int j(int i10) {
        ve1 ve1Var = this.f42367c;
        if (i10 != ve1Var.f43563d0 && i10 != ve1Var.f43560a0) {
            if (i10 >= ve1Var.f43561b0 && i10 < ve1Var.f43562c0) {
                return 2;
            }
            if (i10 >= ve1Var.f43564e0 && i10 < ve1Var.f43565f0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        boolean z10;
        View view = n1Var.f6432a;
        ve1 ve1Var = this.f42367c;
        ze1 ze1Var = ve1Var.f43574p0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 == ve1Var.f43560a0) {
                s3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == ve1Var.f43563d0) {
                s3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.ma maVar = (org.telegram.ui.Cells.ma) view;
            maVar.setTopic((TLRPC.TL_forumTopic) ve1Var.V.get(i10 - ve1Var.f43561b0));
            if (i10 != ve1Var.f43562c0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            maVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) ve1Var.W.get(i10 - ve1Var.f43564e0);
            we1 we1Var = (we1) view;
            if (i10 != ve1Var.f43565f0 - 1) {
                z11 = true;
            }
            we1Var.S4 = z11;
            i11 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = ze1Var.f45188s.findTopic(ze1Var.f45155a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            we1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            we1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        ze1 ze1Var = this.f42367c.f43574p0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? we1Var = new we1(ze1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.o2) ze1Var).inPreviewMode;
                    we1Var.f24857g0 = z10;
                    frameLayout = we1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.ma(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.s3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(frameLayout);
    }
}
