package wg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;
public final class b implements Runnable {
    public final int f45324a;
    public final c f45325b;
    public final MessageObject f45326c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i10) {
        this.f45324a = i10;
        this.f45325b = cVar;
        this.f45326c = messageObject;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f45324a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b(this.f45325b, this.f45326c, this.d, 1));
                return;
            default:
                u1 u1Var = this.f45325b.f45329c;
                long dialogId = this.f45326c.getDialogId();
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (dialogId == (-tL_messageMediaGiveawayResults.channel_id)) {
                    u1Var.getDelegate().b2(u1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.R().presentFragment(new wn(bundle));
                return;
        }
    }
}
