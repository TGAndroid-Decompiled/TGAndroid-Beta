package wg;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.an;
public final class z extends xg.f {
    public final a0 f59296r;

    public z(a0 a0Var, e6 e6Var) {
        super(e6Var);
        this.f59296r = a0Var;
    }

    @Override
    public final void E() {
        String M0;
        a0 a0Var = this.f59296r;
        String str = a0Var.W1;
        if ((str == null || str.isEmpty()) && a0Var.T1.to_id == -1) {
            M0 = hd.M0(2131753334, null);
        } else {
            M0 = hd.M0(2131753333, null);
        }
        new cc(a0Var.f29685c, a0Var.J0).Q(2131623982, 36, M0).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        a0 a0Var = this.f59296r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = a0Var.T1;
        e2 e2Var = a0Var.f35940s1;
        a0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            e2Var.presentFragment(an.ua(-((TLRPC.Chat) tLObject).f28051id));
        } else if (tLObject instanceof TLRPC.User) {
            e2Var.presentFragment(an.ua(((TLRPC.User) tLObject).f28200id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -m5.o(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            e2Var.presentFragment(new an(bundle));
        }
    }
}
