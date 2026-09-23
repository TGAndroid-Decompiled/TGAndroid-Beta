package tg;

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
import org.telegram.ui.xn;
public final class c0 extends ug.e {
    public final d0 f43068r;

    public c0(d0 d0Var, d6 d6Var) {
        super(d6Var);
        this.f43068r = d0Var;
    }

    @Override
    public final void E() {
        String string;
        d6 d6Var;
        d0 d0Var = this.f43068r;
        String str = d0Var.f43074a0;
        if ((str == null || str.isEmpty()) && d0Var.X.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        d3 d3Var = d0Var.container;
        d6Var = ((f3) d0Var).resourcesProvider;
        new xc(d3Var, d6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        d0 d0Var = this.f43068r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = d0Var.X;
        n2 n2Var = d0Var.f22661n;
        d0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            n2Var.presentFragment(xn.R9(-((TLRPC.Chat) tLObject).f18083id));
        } else if (tLObject instanceof TLRPC.User) {
            n2Var.presentFragment(xn.R9(((TLRPC.User) tLObject).f18230id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            n2Var.presentFragment(new xn(bundle));
        }
    }
}
