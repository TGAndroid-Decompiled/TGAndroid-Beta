package xg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
public final class b implements Runnable {
    public final int f49372a;
    public final c f49373b;
    public final MessageObject f49374c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i10) {
        this.f49372a = i10;
        this.f49373b = cVar;
        this.f49374c = messageObject;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f49372a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b(this.f49373b, this.f49374c, this.d, 1));
                return;
            default:
                t1 t1Var = this.f49373b.f49377c;
                long dialogId = this.f49374c.getDialogId();
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (dialogId == (-tL_messageMediaGiveawayResults.channel_id)) {
                    t1Var.getDelegate().T1(t1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.R().presentFragment(new co(bundle));
                return;
        }
    }
}
