package vh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class v0 extends h51 {
    public static final int f46223a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        MessageObject messageObject;
        s sVar;
        w0 w0Var = (w0) view;
        a aVar = (a) i51Var.G;
        w0Var.f46283a = aVar;
        w0Var.P = (m3) i51Var.H;
        w0Var.J = LocaleController.isRTL;
        w0Var.c(aVar);
        w0Var.C.b();
        TLRPC.Document i10 = w0Var.i();
        if (w0Var.R != i10) {
            w0Var.R = i10;
            if (i10 == null) {
                messageObject = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f19205id = -Long.valueOf(i10.f19190id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i11 = w0Var.f46248n;
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
                a aVar2 = w0Var.f46283a;
                if (aVar2 != null && (sVar = aVar2.f45778g) != null && !TextUtils.isEmpty(sVar.e)) {
                    tL_message.attachPath = w0Var.f46283a.f45778g.e;
                }
                messageObject = new MessageObject(i11, tL_message, false, true);
            }
            w0Var.Q = messageObject;
        }
        w0Var.h(i10);
        w0Var.k();
        if (w0Var.K) {
            w0Var.l(false);
        }
        w0Var.requestLayout();
        w0Var.invalidate();
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        w0 w0Var = new w0(context, i10, f6Var);
        w0Var.setBackground(new v1(j6.v0(j6.f19906d6, f6Var)));
        return w0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
