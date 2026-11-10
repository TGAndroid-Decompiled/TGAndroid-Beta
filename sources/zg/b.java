package zg;

import android.os.Bundle;
import org.telegram.messenger.g0;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
public final class b implements Runnable {
    public final int f60181a;
    public final c f60182b;
    public final ij f60183c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, ij ijVar, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i7) {
        this.f60181a = i7;
        this.f60182b = cVar;
        this.f60183c = ijVar;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f60181a) {
            case 0:
                g0.h3(new b(this.f60182b, this.f60183c, this.d, 1));
                return;
            default:
                q1 q1Var = this.f60182b.f60186c;
                long B0 = ij.B0(this.f60183c.f23266k);
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (B0 == (-tL_messageMediaGiveawayResults.channel_id)) {
                    q1Var.getDelegate().R1(q1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.Q().presentFragment(new cn(bundle));
                return;
        }
    }
}
