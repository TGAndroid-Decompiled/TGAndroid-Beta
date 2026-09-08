package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class xf1 extends org.telegram.ui.Components.kl0 {
    public final ag1 f42748c;

    public xf1(ag1 ag1Var) {
        this.f42748c = ag1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45770f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ag1 ag1Var = this.f42748c;
        if (ag1Var.f34465l0) {
            return 0;
        }
        return ag1Var.f34464k0;
    }

    @Override
    public final int j(int i10) {
        ag1 ag1Var = this.f42748c;
        if (i10 != ag1Var.f34461h0 && i10 != ag1Var.f34458e0) {
            if (i10 >= ag1Var.f34459f0 && i10 < ag1Var.f34460g0) {
                return 2;
            }
            if (i10 >= ag1Var.f34462i0 && i10 < ag1Var.f34463j0) {
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
        View view = c1Var.f45766a;
        ag1 ag1Var = this.f42748c;
        eg1 eg1Var = ag1Var.f34472t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == ag1Var.f34458e0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == ag1Var.f34461h0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.setTopic((TLRPC.TL_forumTopic) ag1Var.f34456c0.get(i10 - ag1Var.f34459f0));
            if (i10 != ag1Var.f34460g0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            saVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) ag1Var.f34457d0.get(i10 - ag1Var.f34462i0);
            bg1 bg1Var = (bg1) view;
            if (i10 != ag1Var.f34463j0 - 1) {
                z11 = true;
            }
            bg1Var.W4 = z11;
            i11 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = eg1Var.f36088s.findTopic(eg1Var.f36052a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            bg1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            bg1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        eg1 eg1Var = this.f42748c.f34472t0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? bg1Var = new bg1(eg1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.n2) eg1Var).inPreviewMode;
                    bg1Var.f22610k0 = z10;
                    frameLayout = bg1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.sa(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
