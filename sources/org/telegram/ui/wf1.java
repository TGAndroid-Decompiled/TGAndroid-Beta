package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wf1 extends org.telegram.ui.Components.kl0 {
    public final zf1 f39188c;

    public wf1(zf1 zf1Var) {
        this.f39188c = zf1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42678f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        zf1 zf1Var = this.f39188c;
        if (zf1Var.f40200l0) {
            return 0;
        }
        return zf1Var.f40199k0;
    }

    @Override
    public final int j(int i10) {
        zf1 zf1Var = this.f39188c;
        if (i10 != zf1Var.f40196h0 && i10 != zf1Var.f40193e0) {
            if (i10 >= zf1Var.f40194f0 && i10 < zf1Var.f40195g0) {
                return 2;
            }
            if (i10 >= zf1Var.f40197i0 && i10 < zf1Var.f40198j0) {
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
        View view = c1Var.f42675a;
        zf1 zf1Var = this.f39188c;
        dg1 dg1Var = zf1Var.f40207t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == zf1Var.f40193e0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == zf1Var.f40196h0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) view;
            taVar.setTopic((TLRPC.TL_forumTopic) zf1Var.f40191c0.get(i10 - zf1Var.f40194f0));
            if (i10 != zf1Var.f40195g0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            taVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) zf1Var.f40192d0.get(i10 - zf1Var.f40197i0);
            ag1 ag1Var = (ag1) view;
            if (i10 != zf1Var.f40198j0 - 1) {
                z11 = true;
            }
            ag1Var.W4 = z11;
            i11 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = dg1Var.f33047s.findTopic(dg1Var.f33012a, topicId);
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
        dg1 dg1Var = this.f39188c.f40207t0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? ag1Var = new ag1(dg1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.n2) dg1Var).inPreviewMode;
                    ag1Var.f20708k0 = z10;
                    frameLayout = ag1Var;
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
