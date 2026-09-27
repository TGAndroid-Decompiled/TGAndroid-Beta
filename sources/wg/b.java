package wg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class b implements Runnable {
    public final int f45370a;
    public final c f45371b;
    public final MessageObject f45372c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i10) {
        this.f45370a = i10;
        this.f45371b = cVar;
        this.f45372c = messageObject;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f45370a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b(this.f45371b, this.f45372c, this.d, 1));
                return;
            default:
                u1 u1Var = this.f45371b.f45375c;
                long dialogId = this.f45372c.getDialogId();
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (dialogId == (-tL_messageMediaGiveawayResults.channel_id)) {
                    u1Var.getDelegate().b2(u1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.R().presentFragment(new xn(bundle));
                return;
        }
    }
}
