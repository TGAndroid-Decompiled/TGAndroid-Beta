package wg;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;
public final class b0 extends xg.e {
    public final c0 f59765r;

    public b0(c0 c0Var, h6 h6Var) {
        super(h6Var);
        this.f59765r = c0Var;
    }

    @Override
    public final void E() {
        String N0;
        c0 c0Var = this.f59765r;
        String str = c0Var.W1;
        if ((str == null || str.isEmpty()) && c0Var.T1.to_id == -1) {
            N0 = hd.N0(2131753331, null);
        } else {
            N0 = hd.N0(2131753330, null);
        }
        new lc(c0Var.f30179c, c0Var.J0).Q(2131623982, 36, N0).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        c0 c0Var = this.f59765r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.T1;
        g2 g2Var = c0Var.f39536s1;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            g2Var.presentFragment(bn.ua(-((TLRPC.Chat) tLObject).f28434id));
        } else if (tLObject instanceof TLRPC.User) {
            g2Var.presentFragment(bn.ua(((TLRPC.User) tLObject).f28583id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -n5.o(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            g2Var.presentFragment(new bn(bundle));
        }
    }
}
