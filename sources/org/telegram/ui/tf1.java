package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class tf1 extends og.b {
    public final eg1 d;

    public tf1(eg1 eg1Var) {
        this.d = eg1Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47786f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        eg1 eg1Var = this.d;
        eg1Var.getClass();
        return eg1Var.f37348b;
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
        return ((vf1) this.d.f37348b.get(i10)).f17211a;
    }

    @Override
    public final void l() {
        this.d.f37351c = h();
        super.l();
    }

    @Override
    public final void v(s4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tf1.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        eg1 eg1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                sf1 sf1Var = new sf1(this, eg1Var.getParentActivity());
                eg1Var.E0 = sf1Var;
                return new s4.d1(sf1Var);
            }
            org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(viewGroup.getContext(), null);
            k10Var.setViewType(24);
            k10Var.setIsSingleCell(true);
            k10Var.f27916w = true;
            return new s4.d1(k10Var);
        }
        bg1 bg1Var = new bg1(eg1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) eg1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -eg1Var.f37345a);
            bg1Var.setForumIcon(ng.d.d(ng.a.f16928k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            bg1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            bg1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.m2) eg1Var).inPreviewMode;
        bg1Var.f22843k0 = z10;
        bg1Var.setArchivedPullAnimation(eg1Var.f37386w);
        return new s4.d1(bg1Var);
    }
}
