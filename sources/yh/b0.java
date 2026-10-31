package yh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class b0 extends z41 {
    static {
        z41.h(new z41());
    }

    public static a51 i(zo zoVar, r2 r2Var) {
        long j10;
        TLRPC.User user = zoVar.f19570c;
        if (user != null) {
            a51 K = a51.K(b0.class);
            long j11 = user.f19942id;
            K.B = j11;
            K.d = (int) (j11 ^ (j11 >>> 32));
            K.G = user;
            K.H = r2Var;
            return K;
        }
        TLRPC.Chat chat = zoVar.f19569b;
        a51 K2 = a51.K(b0.class);
        if (chat != null) {
            j10 = -chat.f19793id;
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
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        v2 v2Var = (v2) view;
        v2Var.setDialogCellDelegate((r2) a51Var.H);
        Object obj = a51Var.G;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            v2Var.Q0 = w3.e0(d20.f15147s0, chat);
            TLRPC.Dialog R0 = vp.r1(d20.f15147s0).R0(-chat.f19793id);
            if (R0 != null) {
                z11 = false;
            }
            v2Var.P0 = z11;
            if (R0 != null) {
                v2Var.setCustomMessageWithoutRebuild(null);
                v2Var.e0(R0, 0, 0);
                return;
            }
            v2Var.setCustomMessageWithoutRebuild(cd.G(chat.participants_count, "Members", new Object[0]));
            v2Var.d0(-chat.f19793id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            v2Var.Q0 = w3.f0(d20.f15147s0, user);
            TLRPC.Dialog R02 = vp.r1(d20.f15147s0).R0(user.f19942id);
            if (R02 != null) {
                z11 = false;
            }
            v2Var.P0 = z11;
            if (R02 != null) {
                v2Var.setCustomMessageWithoutRebuild(null);
                v2Var.e0(R02, 0, 0);
                return;
            }
            v2Var.setCustomMessageWithoutRebuild(cd.L0(2131753156, null));
            v2Var.d0(user.f19942id, null, 0, false, false);
        }
    }

    @Override
    public final boolean c(a51 a51Var, a51 a51Var2) {
        if (a51Var.d == a51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        v2 v2Var = new v2(null, context, false, i10, p6Var);
        v2Var.O0 = true;
        return v2Var;
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        if (a51Var.d == a51Var2.d) {
            return true;
        }
        return false;
    }
}
