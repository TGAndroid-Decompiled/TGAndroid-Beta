package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class k0 extends v41 {
    static {
        v41.setup(new v41());
    }

    public static w41 a(MessagesController.CommunityPeerDialog communityPeerDialog, i0 i0Var) {
        long j10;
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            w41 J = w41.J(k0.class);
            long j11 = user.f22539id;
            J.B = j11;
            J.d = (int) (j11 ^ (j11 >>> 32));
            J.G = user;
            J.H = i0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        w41 J2 = w41.J(k0.class);
        if (chat != null) {
            j10 = -chat.f22392id;
        } else {
            j10 = 0;
        }
        J2.B = j10;
        J2.d = (int) (j10 ^ (j10 >>> 32));
        J2.G = chat;
        J2.H = i0Var;
        return J2;
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        p2 p2Var = (p2) view;
        p2Var.setDialogCellDelegate((l2) w41Var.H);
        Object obj = w41Var.G;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            p2Var.M0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.f22392id);
            if (dialog != null) {
                z11 = false;
            }
            p2Var.L0 = z11;
            if (dialog != null) {
                p2Var.setCustomMessageWithoutRebuild(null);
                p2Var.X(dialog, 0, 0);
                return;
            }
            p2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
            p2Var.W(-chat.f22392id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            p2Var.M0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.f22539id);
            if (dialog2 != null) {
                z11 = false;
            }
            p2Var.L0 = z11;
            if (dialog2 != null) {
                p2Var.setCustomMessageWithoutRebuild(null);
                p2Var.X(dialog2, 0, 0);
                return;
            }
            p2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
            p2Var.W(user.f22539id, null, 0, false, false);
        }
    }

    @Override
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        if (w41Var.d == w41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        p2 p2Var = new p2(null, context, false, i10, c6Var);
        p2Var.K0 = true;
        return p2Var;
    }

    @Override
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        if (w41Var.d == w41Var2.d) {
            return true;
        }
        return false;
    }
}
