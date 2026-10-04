package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class rf1 extends org.telegram.ui.Components.yl0 {
    public final uf1 f40114c;

    public rf1(uf1 uf1Var) {
        this.f40114c = uf1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f46527f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        uf1 uf1Var = this.f40114c;
        if (uf1Var.m0) {
            return 0;
        }
        return uf1Var.f41180l0;
    }

    @Override
    public final int j(int i10) {
        uf1 uf1Var = this.f40114c;
        if (i10 != uf1Var.f41177i0 && i10 != uf1Var.f41174f0) {
            if (i10 >= uf1Var.f41175g0 && i10 < uf1Var.f41176h0) {
                return 2;
            }
            if (i10 >= uf1Var.f41178j0 && i10 < uf1Var.f41179k0) {
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
        View view = c1Var.f46523a;
        uf1 uf1Var = this.f40114c;
        yf1 yf1Var = uf1Var.f41188u0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == uf1Var.f41174f0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == uf1Var.f41177i0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.setTopic((TLRPC.TL_forumTopic) uf1Var.f41172d0.get(i10 - uf1Var.f41175g0));
            if (i10 != uf1Var.f41176h0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            saVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) uf1Var.f41173e0.get(i10 - uf1Var.f41178j0);
            vf1 vf1Var = (vf1) view;
            if (i10 != uf1Var.f41179k0 - 1) {
                z11 = true;
            }
            vf1Var.W4 = z11;
            i11 = ((org.telegram.ui.ActionBar.n2) yf1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = yf1Var.f43198s.findTopic(yf1Var.f43162a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            vf1Var.X(findTopic, messageObject.getDialogId(), messageObject, false, false);
            vf1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        yf1 yf1Var = this.f40114c.f41188u0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? vf1Var = new vf1(yf1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.n2) yf1Var).inPreviewMode;
                    vf1Var.f22818k0 = z10;
                    frameLayout = vf1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.sa(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
