package pg;

import android.os.Bundle;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class b implements Runnable {
    public final int f44940a;
    public final c f44941b;
    public final jj f44942c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, jj jjVar, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i10) {
        this.f44940a = i10;
        this.f44941b = cVar;
        this.f44942c = jjVar;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f44940a) {
            case 0:
                i0.g3(new b(this.f44941b, this.f44942c, this.d, 1));
                return;
            default:
                q1 q1Var = this.f44941b.f44945c;
                long B0 = jj.B0(this.f44942c.f16337k);
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
