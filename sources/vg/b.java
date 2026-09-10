package vg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
public final class b implements Runnable {
    public final int f43332a;
    public final c f43333b;
    public final MessageObject f43334c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i10) {
        this.f43332a = i10;
        this.f43333b = cVar;
        this.f43334c = messageObject;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f43332a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b(this.f43333b, this.f43334c, this.d, 1));
                return;
            default:
                t1 t1Var = this.f43333b.f43337c;
                long dialogId = this.f43334c.getDialogId();
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (dialogId == (-tL_messageMediaGiveawayResults.channel_id)) {
                    t1Var.getDelegate().Z1(t1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
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
