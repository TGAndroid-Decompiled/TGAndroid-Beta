package sh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ed;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.o70;
import r0.j1;
import r0.m1;
public final class s implements Utilities.Callback5, r0.o, Utilities.Callback5Return {
    public final int f44410a;
    public final i0 f44411b;

    public s(i0 i0Var, int i10) {
        this.f44410a = i10;
        this.f44411b = i0Var;
    }

    @Override
    public m1 N0(View view, m1 m1Var) {
        j1 j1Var = m1Var.f43130a;
        i0.b f10 = j1Var.f(527);
        i0 i0Var = this.f44411b;
        i0Var.Q = f10;
        i0Var.R = j1Var.f(519);
        i0Var.C.j(AndroidUtilities.dp(56.0f) + i0Var.Q.f7214b, i0Var.Q.d, false);
        i0Var.E.invalidate();
        return m1.f43129b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean canRemoveBotFromCommunity;
        long j10;
        boolean z4;
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = i0.S;
        Object obj6 = ((i51) obj).G;
        boolean z11 = obj6 instanceof TLRPC.Chat;
        i0 i0Var = this.f44411b;
        boolean z12 = false;
        if (z11) {
            TLRPC.Chat chat = (TLRPC.Chat) obj6;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, i0Var.f44353f);
            j10 = -chat.f19184id;
            z10 = false;
            z4 = isChannelAndNotMegaGroup;
        } else {
            if (obj6 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj6;
                long j11 = user.f19331id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, i0Var.f44353f);
                j10 = j11;
                z4 = false;
                z10 = isBot;
            }
            return Boolean.valueOf(z12);
        }
        if (canRemoveBotFromCommunity) {
            o70 F = o70.F(i0Var.container, null, view);
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), new ed(i0Var, z10, z4, j10, 3), true);
            F.W(i0Var.v.d.V0(view, true));
            F.Z();
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f44410a;
        i0 i0Var = this.f44411b;
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (i10) {
            case 0:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                i0Var.W(i51Var);
                return;
            case 1:
            default:
                num.intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                int i11 = i0.S;
                i0Var.T(i51Var);
                return;
            case 2:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i12 = i0.S;
                i0Var.W(i51Var);
                return;
            case 3:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                i0.y(i0Var, i51Var, view);
                return;
        }
    }
}
