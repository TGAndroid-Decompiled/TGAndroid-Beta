package th;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class v0 extends v41 {
    public static final int f48810a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        MessageObject messageObject;
        s sVar;
        w0 w0Var = (w0) view;
        a aVar = (a) w41Var.G;
        w0Var.f48892a = aVar;
        w0Var.O = (k3) w41Var.H;
        w0Var.I = LocaleController.isRTL;
        w0Var.c(aVar);
        w0Var.B.b();
        TLRPC.Document i10 = w0Var.i();
        if (w0Var.Q != i10) {
            w0Var.Q = i10;
            if (i10 == null) {
                messageObject = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f22413id = -Long.valueOf(i10.f22398id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i11 = w0Var.f48823n;
                long clientUserId = UserConfig.getInstance(i11).getClientUserId();
                peer.user_id = clientUserId;
                tL_peerUser.user_id = clientUserId;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = i10;
                tL_message.flags |= 768;
                a aVar2 = w0Var.f48892a;
                if (aVar2 != null && (sVar = aVar2.f48332g) != null && !TextUtils.isEmpty(sVar.f48715e)) {
                    tL_message.attachPath = w0Var.f48892a.f48332g.f48715e;
                }
                messageObject = new MessageObject(i11, tL_message, false, true);
            }
            w0Var.P = messageObject;
        }
        w0Var.h(i10);
        w0Var.k();
        if (w0Var.J) {
            w0Var.l(false);
        }
        w0Var.requestLayout();
        w0Var.invalidate();
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        w0 w0Var = new w0(context, i10, c6Var);
        w0Var.setBackground(new u1(g6.v0(g6.f23062d6, c6Var)));
        return w0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
