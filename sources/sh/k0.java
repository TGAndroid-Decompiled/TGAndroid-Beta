package sh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class k0 extends h51 {
    static {
        h51.setup(new h51());
    }

    public static i51 a(MessagesController.CommunityPeerDialog communityPeerDialog, i0 i0Var) {
        long j10;
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            i51 J = i51.J(k0.class);
            long j11 = user.f19331id;
            J.B = j11;
            J.d = (int) (j11 ^ (j11 >>> 32));
            J.G = user;
            J.H = i0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        i51 J2 = i51.J(k0.class);
        if (chat != null) {
            j10 = -chat.f19184id;
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
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        r2 r2Var = (r2) view;
        r2Var.setDialogCellDelegate((n2) i51Var.H);
        Object obj = i51Var.G;
        boolean z10 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            r2Var.N0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.f19184id);
            if (dialog != null) {
                z10 = false;
            }
            r2Var.M0 = z10;
            if (dialog != null) {
                r2Var.setCustomMessageWithoutRebuild(null);
                r2Var.X(dialog, 0, 0);
                return;
            }
            r2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
            r2Var.W(-chat.f19184id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            r2Var.N0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.f19331id);
            if (dialog2 != null) {
                z10 = false;
            }
            r2Var.M0 = z10;
            if (dialog2 != null) {
                r2Var.setCustomMessageWithoutRebuild(null);
                r2Var.X(dialog2, 0, 0);
                return;
            }
            r2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
            r2Var.W(user.f19331id, null, 0, false, false);
        }
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (i51Var.d == i51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        r2 r2Var = new r2(null, context, false, i10, f6Var);
        r2Var.L0 = true;
        return r2Var;
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.d == i51Var2.d) {
            return true;
        }
        return false;
    }
}
