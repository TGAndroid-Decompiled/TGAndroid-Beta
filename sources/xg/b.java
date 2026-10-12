package xg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
public final class b implements Runnable {
    public final int f48415a;
    public final c f48416b;
    public final MessageObject f48417c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i10) {
        this.f48415a = i10;
        this.f48416b = cVar;
        this.f48417c = messageObject;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f48415a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b(this.f48416b, this.f48417c, this.d, 1));
                return;
            default:
                u1 u1Var = this.f48416b.f48420c;
                long dialogId = this.f48417c.getDialogId();
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (dialogId == (-tL_messageMediaGiveawayResults.channel_id)) {
                    u1Var.getDelegate().R1(u1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.R().presentFragment(new fo(bundle));
                return;
        }
    }
}
