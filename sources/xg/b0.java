package xg;

import android.os.Bundle;
import org.telegram.messenger.bd;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.wm;
public final class b0 extends yg.e {
    public final c0 f58656r;

    public b0(c0 c0Var, e6 e6Var) {
        super(e6Var);
        this.f58656r = c0Var;
    }

    @Override
    public final void E() {
        String M0;
        c0 c0Var = this.f58656r;
        String str = c0Var.T1;
        if ((str == null || str.isEmpty()) && c0Var.Q1.to_id == -1) {
            M0 = bd.M0(2131753334, null);
        } else {
            M0 = bd.M0(2131753333, null);
        }
        new fc(c0Var.f28589c, c0Var.J0).Q(2131623981, 36, M0).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        c0 c0Var = this.f58656r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.Q1;
        d2 d2Var = c0Var.f36105p1;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            d2Var.presentFragment(wm.ra(-((TLRPC.Chat) tLObject).f27001id));
        } else if (tLObject instanceof TLRPC.User) {
            d2Var.presentFragment(wm.ra(((TLRPC.User) tLObject).f27150id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -m5.o(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            d2Var.presentFragment(new wm(bundle));
        }
    }
}
