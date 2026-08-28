package qh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class v0 extends k41 {
    public static final int f46750a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        MessageObject messageObject;
        s sVar;
        w0 w0Var = (w0) view;
        a aVar = (a) l41Var.G;
        w0Var.f46834a = aVar;
        w0Var.O = (j3) l41Var.H;
        w0Var.I = LocaleController.isRTL;
        w0Var.c(aVar);
        w0Var.B.b();
        TLRPC.Document i9 = w0Var.i();
        if (w0Var.Q != i9) {
            w0Var.Q = i9;
            if (i9 == null) {
                messageObject = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f22401id = -Long.valueOf(i9.f22386id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i10 = w0Var.f46762n;
                long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                peer.user_id = clientUserId;
                tL_peerUser.user_id = clientUserId;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = i9;
                tL_message.flags |= 768;
                a aVar2 = w0Var.f46834a;
                if (aVar2 != null && (sVar = aVar2.f46273g) != null && !TextUtils.isEmpty(sVar.f46671e)) {
                    tL_message.attachPath = w0Var.f46834a.f46273g.f46671e;
                }
                messageObject = new MessageObject(i10, tL_message, false, true);
            }
            w0Var.P = messageObject;
        }
        w0Var.h(i9);
        w0Var.k();
        if (w0Var.J) {
            w0Var.l(false);
        }
        w0Var.requestLayout();
        w0Var.invalidate();
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        w0 w0Var = new w0(context, i9, b6Var);
        w0Var.setBackground(new u1(f6.v0(f6.f23001d6, b6Var)));
        return w0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
