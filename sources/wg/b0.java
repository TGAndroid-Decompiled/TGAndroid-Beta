package wg;

import android.os.Bundle;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.cn;
public final class b0 extends xg.f {
    public final c0 f57698r;

    public b0(c0 c0Var, h6 h6Var) {
        super(h6Var);
        this.f57698r = c0Var;
    }

    @Override
    public final void E() {
        String M0;
        c0 c0Var = this.f57698r;
        String str = c0Var.V1;
        if ((str == null || str.isEmpty()) && c0Var.S1.to_id == -1) {
            M0 = id.M0(2131753334, null);
        } else {
            M0 = id.M0(2131753333, null);
        }
        new gc(c0Var.f28675c, c0Var.I0).Q(2131623981, 36, M0).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        c0 c0Var = this.f57698r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.S1;
        f2 f2Var = c0Var.f35905r1;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            f2Var.presentFragment(cn.ta(-((TLRPC.Chat) tLObject).f26960id));
        } else if (tLObject instanceof TLRPC.User) {
            f2Var.presentFragment(cn.ta(((TLRPC.User) tLObject).f27109id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -m5.o(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            f2Var.presentFragment(new cn(bundle));
        }
    }
}
