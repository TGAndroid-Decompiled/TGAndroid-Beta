package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class te1 extends org.telegram.ui.Components.lm0 {
    public final we1 f43815c;

    public te1(we1 we1Var) {
        this.f43815c = we1Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47738f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        we1 we1Var = this.f43815c;
        if (we1Var.f45131n0) {
            return 0;
        }
        return we1Var.m0;
    }

    @Override
    public final int j(int i10) {
        we1 we1Var = this.f43815c;
        if (i10 != we1Var.f45128j0 && i10 != we1Var.f45125g0) {
            if (i10 >= we1Var.f45126h0 && i10 < we1Var.f45127i0) {
                return 2;
            }
            if (i10 >= we1Var.f45129k0 && i10 < we1Var.f45130l0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        boolean z10;
        View view = e1Var.f47735a;
        we1 we1Var = this.f43815c;
        af1 af1Var = we1Var.f45139v0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 == we1Var.f45125g0) {
                z3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == we1Var.f45128j0) {
                z3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
            uaVar.setTopic((TLRPC.TL_forumTopic) we1Var.f45123e0.get(i10 - we1Var.f45126h0));
            if (i10 != we1Var.f45127i0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            uaVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) we1Var.f45124f0.get(i10 - we1Var.f45129k0);
            xe1 xe1Var = (xe1) view;
            if (i10 != we1Var.f45130l0 - 1) {
                z11 = true;
            }
            xe1Var.f45746a5 = z11;
            i11 = ((org.telegram.ui.ActionBar.r2) af1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = af1Var.f37769s.findTopic(af1Var.f37731a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            xe1Var.X(findTopic, messageObject.getDialogId(), messageObject, false, false);
            xe1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        af1 af1Var = this.f43815c.f45139v0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? xe1Var = new xe1(af1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.r2) af1Var).inPreviewMode;
                    xe1Var.f24677k0 = z10;
                    frameLayout = xe1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.ua(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.z3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(frameLayout);
    }
}
