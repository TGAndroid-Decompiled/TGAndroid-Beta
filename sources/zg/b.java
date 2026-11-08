package zg;

import android.os.Bundle;
import org.telegram.messenger.g0;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class b implements Runnable {
    public final int f60173a;
    public final c f60174b;
    public final ij f60175c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, ij ijVar, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i7) {
        this.f60173a = i7;
        this.f60174b = cVar;
        this.f60175c = ijVar;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f60173a) {
            case 0:
                g0.h3(new b(this.f60174b, this.f60175c, this.d, 1));
                return;
            default:
                q1 q1Var = this.f60174b.f60178c;
                long B0 = ij.B0(this.f60175c.f23262k);
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (B0 == (-tL_messageMediaGiveawayResults.channel_id)) {
                    q1Var.getDelegate().R1(q1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.Q().presentFragment(new an(bundle));
                return;
        }
    }
}
