package wg;

import android.os.Bundle;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;
public final class b0 extends xg.e {
    public final c0 f59722r;

    public b0(c0 c0Var, i6 i6Var) {
        super(i6Var);
        this.f59722r = c0Var;
    }

    @Override
    public final void E() {
        String M0;
        c0 c0Var = this.f59722r;
        String str = c0Var.W1;
        if ((str == null || str.isEmpty()) && c0Var.T1.to_id == -1) {
            M0 = gd.M0(2131753332, null);
        } else {
            M0 = gd.M0(2131753331, null);
        }
        new lc(c0Var.f30195c, c0Var.J0).Q(2131623982, 36, M0).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        c0 c0Var = this.f59722r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.T1;
        h2 h2Var = c0Var.f39538s1;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            h2Var.presentFragment(bn.ua(-((TLRPC.Chat) tLObject).f28405id));
        } else if (tLObject instanceof TLRPC.User) {
            h2Var.presentFragment(bn.ua(((TLRPC.User) tLObject).f28554id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -n5.o(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            h2Var.presentFragment(new bn(bundle));
        }
    }
}
