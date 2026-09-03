package wh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class w0 extends g51 {
    public static final int f50163a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        MessageObject messageObject;
        t tVar;
        x0 x0Var = (x0) view;
        a aVar = (a) h51Var.G;
        x0Var.f50211a = aVar;
        x0Var.P = (m3) h51Var.H;
        x0Var.J = LocaleController.isRTL;
        x0Var.c(aVar);
        x0Var.C.b();
        TLRPC.Document i10 = x0Var.i();
        if (x0Var.R != i10) {
            x0Var.R = i10;
            if (i10 == null) {
                messageObject = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f20866id = -Long.valueOf(i10.f20851id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i11 = x0Var.f50178n;
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
                a aVar2 = x0Var.f50211a;
                if (aVar2 != null && (tVar = aVar2.f49657g) != null && !TextUtils.isEmpty(tVar.f50069e)) {
                    tL_message.attachPath = x0Var.f50211a.f49657g.f50069e;
                }
                messageObject = new MessageObject(i11, tL_message, false, true);
            }
            x0Var.Q = messageObject;
        }
        x0Var.h(i10);
        x0Var.k();
        if (x0Var.K) {
            x0Var.l(false);
        }
        x0Var.requestLayout();
        x0Var.invalidate();
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        x0 x0Var = new x0(context, i10, g6Var);
        x0Var.setBackground(new w1(k6.v0(k6.f21661d6, g6Var)));
        return x0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
