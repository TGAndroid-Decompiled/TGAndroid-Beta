package yh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ap;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class a0 extends a51 {
    static {
        a51.h(new a51());
    }

    public static b51 i(ap apVar, r2 r2Var) {
        long j10;
        TLRPC.User user = apVar.f14666c;
        if (user != null) {
            b51 K = b51.K(a0.class);
            long j11 = user.f19943id;
            K.B = j11;
            K.d = (int) (j11 ^ (j11 >>> 32));
            K.G = user;
            K.H = r2Var;
            return K;
        }
        TLRPC.Chat chat = apVar.f14665b;
        b51 K2 = b51.K(a0.class);
        if (chat != null) {
            j10 = -chat.f19794id;
        } else {
            j10 = 0;
        }
        K2.B = j10;
        K2.d = (int) (j10 ^ (j10 >>> 32));
        K2.G = chat;
        K2.H = r2Var;
        return K2;
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        v2 v2Var = (v2) view;
        v2Var.setDialogCellDelegate((r2) b51Var.H);
        Object obj = b51Var.G;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            v2Var.Q0 = w3.e0(e20.f15506s0, chat);
            TLRPC.Dialog R0 = wp.r1(e20.f15506s0).R0(-chat.f19794id);
            if (R0 != null) {
                z11 = false;
            }
            v2Var.P0 = z11;
            if (R0 != null) {
                v2Var.setCustomMessageWithoutRebuild(null);
                v2Var.e0(R0, 0, 0);
                return;
            }
            v2Var.setCustomMessageWithoutRebuild(dd.G(chat.participants_count, "Members", new Object[0]));
            v2Var.d0(-chat.f19794id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            v2Var.Q0 = w3.f0(e20.f15506s0, user);
            TLRPC.Dialog R02 = wp.r1(e20.f15506s0).R0(user.f19943id);
            if (R02 != null) {
                z11 = false;
            }
            v2Var.P0 = z11;
            if (R02 != null) {
                v2Var.setCustomMessageWithoutRebuild(null);
                v2Var.e0(R02, 0, 0);
                return;
            }
            v2Var.setCustomMessageWithoutRebuild(dd.L0(2131753156, null));
            v2Var.d0(user.f19943id, null, 0, false, false);
        }
    }

    @Override
    public final boolean c(b51 b51Var, b51 b51Var2) {
        if (b51Var.d == b51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        v2 v2Var = new v2(null, context, false, i10, p6Var);
        v2Var.O0 = true;
        return v2Var;
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        if (b51Var.d == b51Var2.d) {
            return true;
        }
        return false;
    }
}
