package pg;

import android.os.Bundle;
import org.telegram.messenger.i0;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class b implements Runnable {
    public final int f44951a;
    public final c f44952b;
    public final kj f44953c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, kj kjVar, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i10) {
        this.f44951a = i10;
        this.f44952b = cVar;
        this.f44953c = kjVar;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f44951a) {
            case 0:
                i0.g3(new b(this.f44952b, this.f44953c, this.d, 1));
                return;
            default:
                q1 q1Var = this.f44952b.f44956c;
                long B0 = kj.B0(this.f44953c.f16690k);
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (B0 == (-tL_messageMediaGiveawayResults.channel_id)) {
                    q1Var.getDelegate().L1(q1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.Q().presentFragment(new un(bundle));
                return;
        }
    }
}
