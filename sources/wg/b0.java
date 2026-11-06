package wg;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.an;
public final class b0 extends xg.f {
    public final c0 f57609r;

    public b0(c0 c0Var, f6 f6Var) {
        super(f6Var);
        this.f57609r = c0Var;
    }

    @Override
    public final void E() {
        String M0;
        c0 c0Var = this.f57609r;
        String str = c0Var.S1;
        if ((str == null || str.isEmpty()) && c0Var.P1.to_id == -1) {
            M0 = hd.M0(2131753334, null);
        } else {
            M0 = hd.M0(2131753333, null);
        }
        new hc(c0Var.f28618c, c0Var.I0).Q(2131623981, 36, M0).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        c0 c0Var = this.f57609r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.P1;
        f2 f2Var = c0Var.f36224o1;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            f2Var.presentFragment(an.ra(-((TLRPC.Chat) tLObject).f26952id));
        } else if (tLObject instanceof TLRPC.User) {
            f2Var.presentFragment(an.ra(((TLRPC.User) tLObject).f27101id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -m5.o(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            f2Var.presentFragment(new an(bundle));
        }
    }
}
