package zg;

import android.os.Bundle;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class b implements Runnable {
    public final int f61382a;
    public final c f61383b;
    public final gj f61384c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, gj gjVar, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i7) {
        this.f61382a = i7;
        this.f61383b = cVar;
        this.f61384c = gjVar;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f61382a) {
            case 0:
                g0.h3(new b(this.f61383b, this.f61384c, this.d, 1));
                return;
            default:
                q1 q1Var = this.f61383b.f61387c;
                long B0 = gj.B0(this.f61384c.f23819k);
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (B0 == (-tL_messageMediaGiveawayResults.channel_id)) {
                    q1Var.getDelegate().g2(q1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
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
