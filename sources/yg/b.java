package yg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class b implements Runnable {
    public final int f52551a;
    public final c f52552b;
    public final MessageObject f52553c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i10) {
        this.f52551a = i10;
        this.f52552b = cVar;
        this.f52553c = messageObject;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f52551a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b(this.f52552b, this.f52553c, this.d, 1));
                return;
            default:
                s1 s1Var = this.f52552b.f52556c;
                long dialogId = this.f52553c.getDialogId();
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (dialogId == (-tL_messageMediaGiveawayResults.channel_id)) {
                    s1Var.getDelegate().H1(s1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.R().presentFragment(new un(bundle));
                return;
        }
    }
}
