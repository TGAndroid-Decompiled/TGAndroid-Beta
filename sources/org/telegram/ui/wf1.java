package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class wf1 extends og.b {
    public final hg1 d;

    public wf1(hg1 hg1Var) {
        this.d = hg1Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47901f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        hg1 hg1Var = this.d;
        hg1Var.getClass();
        return hg1Var.f38379b;
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
        return ((yf1) this.d.f38379b.get(i10)).f16877a;
    }

    @Override
    public final void l() {
        this.d.f38382c = h();
        super.l();
    }

    @Override
    public final void v(s4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wf1.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        hg1 hg1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                vf1 vf1Var = new vf1(this, hg1Var.getParentActivity());
                hg1Var.E0 = vf1Var;
                return new s4.d1(vf1Var);
            }
            org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(viewGroup.getContext(), null);
            m10Var.setViewType(24);
            m10Var.setIsSingleCell(true);
            m10Var.f28350w = true;
            return new s4.d1(m10Var);
        }
        eg1 eg1Var = new eg1(hg1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) hg1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -hg1Var.f38376a);
            eg1Var.setForumIcon(ng.d.d(ng.a.f16596k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            eg1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            eg1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.m2) hg1Var).inPreviewMode;
        eg1Var.f22579k0 = z10;
        eg1Var.setArchivedPullAnimation(hg1Var.f38417w);
        return new s4.d1(eg1Var);
    }
}
