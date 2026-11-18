package zg;

import android.os.Bundle;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class b implements Runnable {
    public final int f61948a;
    public final c f61949b;
    public final fj f61950c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, fj fjVar, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i7) {
        this.f61948a = i7;
        this.f61949b = cVar;
        this.f61950c = fjVar;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f61948a) {
            case 0:
                g0.g3(new b(this.f61949b, this.f61950c, this.d, 1));
                return;
            default:
                q1 q1Var = this.f61949b.f61953c;
                long B0 = fj.B0(this.f61950c.f23968k);
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (B0 == (-tL_messageMediaGiveawayResults.channel_id)) {
                    q1Var.getDelegate().g2(q1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
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
