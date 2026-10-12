package wg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
public final class b implements Runnable {
    public final int f50600a;
    public final c f50601b;
    public final MessageObject f50602c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i10) {
        this.f50600a = i10;
        this.f50601b = cVar;
        this.f50602c = messageObject;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f50600a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b(this.f50601b, this.f50602c, this.d, 1));
                return;
            default:
                u1 u1Var = this.f50601b.f50605c;
                long dialogId = this.f50602c.getDialogId();
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (dialogId == (-tL_messageMediaGiveawayResults.channel_id)) {
                    u1Var.getDelegate().h2(u1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.R().presentFragment(new eo(bundle));
                return;
        }
    }
}
