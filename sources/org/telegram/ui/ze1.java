package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class ze1 extends bg.c {
    public final kf1 d;

    public ze1(kf1 kf1Var) {
        this.d = kf1Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        kf1 kf1Var = this.d;
        kf1Var.getClass();
        return kf1Var.f35671b;
    }

    @Override
    public final int h() {
        return F().size() + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 2;
        }
        return ((bf1) this.d.f35671b.get(i10)).f1808a;
    }

    @Override
    public final void l() {
        this.d.f35674c = h();
        super.l();
    }

    @Override
    public final void v(f2.l1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ze1.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        int i11;
        int i12;
        int i13;
        kf1 kf1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                ye1 ye1Var = new ye1(this, kf1Var.getParentActivity());
                kf1Var.B0 = ye1Var;
                return new f2.l1(ye1Var);
            }
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(viewGroup.getContext(), null);
            t00Var.setViewType(24);
            t00Var.setIsSingleCell(true);
            t00Var.f28855w = true;
            return new f2.l1(t00Var);
        }
        hf1 hf1Var = new hf1(kf1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) kf1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -kf1Var.f35668a);
            hf1Var.setForumIcon(ag.f.d(ag.b.f175k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            hf1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            hf1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z4 = ((org.telegram.ui.ActionBar.p2) kf1Var).inPreviewMode;
        hf1Var.f21654h0 = z4;
        hf1Var.setArchivedPullAnimation(kf1Var.f35706w);
        return new f2.l1(hf1Var);
    }
}
