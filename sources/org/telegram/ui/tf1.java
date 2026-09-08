package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class tf1 extends pg.b {
    public final eg1 d;

    public tf1(eg1 eg1Var) {
        this.d = eg1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45770f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        eg1 eg1Var = this.d;
        eg1Var.getClass();
        return eg1Var.f36055b;
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
        return ((vf1) this.d.f36055b.get(i10)).f44098a;
    }

    @Override
    public final void l() {
        this.d.f36058c = h();
        super.l();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tf1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        eg1 eg1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                sf1 sf1Var = new sf1(this, eg1Var.getParentActivity());
                eg1Var.E0 = sf1Var;
                return new s4.c1(sf1Var);
            }
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(viewGroup.getContext(), null);
            t00Var.setViewType(24);
            t00Var.setIsSingleCell(true);
            t00Var.f30492w = true;
            return new s4.c1(t00Var);
        }
        bg1 bg1Var = new bg1(eg1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -eg1Var.f36052a);
            bg1Var.setForumIcon(og.d.d(og.a.f17039k[0], ""));
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
        z10 = ((org.telegram.ui.ActionBar.n2) eg1Var).inPreviewMode;
        bg1Var.f22610k0 = z10;
        bg1Var.setArchivedPullAnimation(eg1Var.f36093w);
        return new s4.c1(bg1Var);
    }
}
