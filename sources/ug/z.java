package ug;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;
public final class z extends vg.e {
    public final a0 f47841r;

    public z(a0 a0Var, d6 d6Var) {
        super(d6Var);
        this.f47841r = a0Var;
    }

    @Override
    public final void E() {
        String string;
        d6 d6Var;
        a0 a0Var = this.f47841r;
        String str = a0Var.f47665a0;
        if ((str == null || str.isEmpty()) && a0Var.X.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        d3 d3Var = a0Var.container;
        d6Var = ((f3) a0Var).resourcesProvider;
        new xc(d3Var, d6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        a0 a0Var = this.f47841r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = a0Var.X;
        n2 n2Var = a0Var.f24915n;
        a0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            n2Var.presentFragment(sn.W9(-((TLRPC.Chat) tLObject).f20272id));
        } else if (tLObject instanceof TLRPC.User) {
            n2Var.presentFragment(sn.W9(((TLRPC.User) tLObject).f20419id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            n2Var.presentFragment(new sn(bundle));
        }
    }
}
