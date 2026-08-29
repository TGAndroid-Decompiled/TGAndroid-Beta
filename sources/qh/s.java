package qh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.w41;
import r0.j1;
import r0.m1;
public final class s implements Utilities.Callback5, r0.o, Utilities.Callback5Return {
    public final int f46776a;
    public final i0 f46777b;

    public s(i0 i0Var, int i10) {
        this.f46776a = i10;
        this.f46777b = i0Var;
    }

    @Override
    public m1 I0(View view, m1 m1Var) {
        j1 j1Var = m1Var.f46843a;
        i0.b f9 = j1Var.f(527);
        i0 i0Var = this.f46777b;
        i0Var.P = f9;
        i0Var.Q = j1Var.f(519);
        i0Var.B.j(AndroidUtilities.dp(56.0f) + i0Var.P.f8187b, i0Var.P.d, false);
        i0Var.D.invalidate();
        return m1.f46842b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean canRemoveBotFromCommunity;
        long j10;
        boolean z10;
        boolean z11;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = i0.R;
        Object obj6 = ((w41) obj).G;
        boolean z12 = obj6 instanceof TLRPC.Chat;
        i0 i0Var = this.f46777b;
        boolean z13 = false;
        if (z12) {
            TLRPC.Chat chat = (TLRPC.Chat) obj6;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, i0Var.f46716f);
            j10 = -chat.f22392id;
            z11 = false;
            z10 = isChannelAndNotMegaGroup;
        } else {
            if (obj6 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj6;
                long j11 = user.f22539id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, i0Var.f46716f);
                j10 = j11;
                z10 = false;
                z11 = isBot;
            }
            return Boolean.valueOf(z13);
        }
        if (canRemoveBotFromCommunity) {
            j70 F = j70.F(i0Var.container, null, view);
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), new dd(i0Var, z11, z10, j10, 3), true);
            F.W(i0Var.v.d.V0(view, true));
            F.Z();
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f46776a;
        i0 i0Var = this.f46777b;
        w41 w41Var = (w41) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (i10) {
            case 0:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                i0Var.W(w41Var);
                return;
            case 1:
            default:
                num.intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                int i11 = i0.R;
                i0Var.T(w41Var);
                return;
            case 2:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i12 = i0.R;
                i0Var.W(w41Var);
                return;
            case 3:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                i0.y(i0Var, w41Var, view);
                return;
        }
    }
}
