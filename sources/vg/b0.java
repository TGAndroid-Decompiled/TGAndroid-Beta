package vg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.wc;
import org.telegram.ui.un;
public final class b0 extends wg.e {
    public final c0 f50144r;

    public b0(c0 c0Var, u6 u6Var) {
        super(u6Var);
        this.f50144r = c0Var;
    }

    @Override
    public final void E() {
        String string;
        c0 c0Var = this.f50144r;
        String str = c0Var.f50150a0;
        if ((str == null || str.isEmpty()) && c0Var.X.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        new wc(c0Var.container, c0.P(c0Var)).R(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        c0 c0Var = this.f50144r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.X;
        r2 r2Var = c0Var.f26809n;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            r2Var.presentFragment(un.ba(-((TLRPC.Chat) tLObject).f22027id));
        } else if (tLObject instanceof TLRPC.User) {
            r2Var.presentFragment(un.ba(((TLRPC.User) tLObject).f22174id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            r2Var.presentFragment(new un(bundle));
        }
    }
}
