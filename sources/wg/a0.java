package wg;

import android.os.Bundle;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.kc;
import org.telegram.ui.bn;
public final class a0 extends xg.e {
    public final b0 f59824r;

    public a0(b0 b0Var, i6 i6Var) {
        super(i6Var);
        this.f59824r = b0Var;
    }

    @Override
    public final void E() {
        String N0;
        b0 b0Var = this.f59824r;
        String str = b0Var.W1;
        if ((str == null || str.isEmpty()) && b0Var.T1.to_id == -1) {
            N0 = gd.N0(2131753331, null);
        } else {
            N0 = gd.N0(2131753330, null);
        }
        new kc(b0Var.f30229c, b0Var.J0).Q(2131623982, 36, N0).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        b0 b0Var = this.f59824r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = b0Var.T1;
        g2 g2Var = b0Var.f39250s1;
        b0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            g2Var.presentFragment(bn.ua(-((TLRPC.Chat) tLObject).f28492id));
        } else if (tLObject instanceof TLRPC.User) {
            g2Var.presentFragment(bn.ua(((TLRPC.User) tLObject).f28641id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -n5.o(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            g2Var.presentFragment(new bn(bundle));
        }
    }
}
