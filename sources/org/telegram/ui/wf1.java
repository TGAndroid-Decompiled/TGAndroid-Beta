package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wf1 extends org.telegram.ui.Components.vl0 {
    public final zf1 f39142c;

    public wf1(zf1 zf1Var) {
        this.f39142c = zf1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42932f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        zf1 zf1Var = this.f39142c;
        if (zf1Var.m0) {
            return 0;
        }
        return zf1Var.f40125l0;
    }

    @Override
    public final int j(int i10) {
        zf1 zf1Var = this.f39142c;
        if (i10 != zf1Var.f40122i0 && i10 != zf1Var.f40119f0) {
            if (i10 >= zf1Var.f40120g0 && i10 < zf1Var.f40121h0) {
                return 2;
            }
            if (i10 >= zf1Var.f40123j0 && i10 < zf1Var.f40124k0) {
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
        View view = c1Var.f42929a;
        zf1 zf1Var = this.f39142c;
        dg1 dg1Var = zf1Var.f40133u0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == zf1Var.f40119f0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == zf1Var.f40122i0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.setTopic((TLRPC.TL_forumTopic) zf1Var.f40117d0.get(i10 - zf1Var.f40120g0));
            if (i10 != zf1Var.f40121h0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            saVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) zf1Var.f40118e0.get(i10 - zf1Var.f40123j0);
            ag1 ag1Var = (ag1) view;
            if (i10 != zf1Var.f40124k0 - 1) {
                z11 = true;
            }
            ag1Var.W4 = z11;
            i11 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = dg1Var.f33005s.findTopic(dg1Var.f32970a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            ag1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            ag1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        dg1 dg1Var = this.f39142c.f40133u0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? ag1Var = new ag1(dg1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.n2) dg1Var).inPreviewMode;
                    ag1Var.f20934k0 = z10;
                    frameLayout = ag1Var;
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
