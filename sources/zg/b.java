package zg;

import android.os.Bundle;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class b implements Runnable {
    public final int f61990a;
    public final c f61991b;
    public final fj f61992c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, fj fjVar, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i7) {
        this.f61990a = i7;
        this.f61991b = cVar;
        this.f61992c = fjVar;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f61990a) {
            case 0:
                g0.g3(new b(this.f61991b, this.f61992c, this.d, 1));
                return;
            default:
                r1 r1Var = this.f61991b.f61995c;
                long B0 = fj.B0(this.f61992c.f23993k);
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (B0 == (-tL_messageMediaGiveawayResults.channel_id)) {
                    r1Var.getDelegate().g2(r1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.Q().presentFragment(new bn(bundle));
                return;
        }
    }
}
