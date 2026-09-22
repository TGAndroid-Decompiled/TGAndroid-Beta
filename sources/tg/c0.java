package tg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
public final class c0 extends ug.e {
    public final d0 f43113r;

    public c0(d0 d0Var, e6 e6Var) {
        super(e6Var);
        this.f43113r = d0Var;
    }

    @Override
    public final void E() {
        String string;
        e6 e6Var;
        d0 d0Var = this.f43113r;
        String str = d0Var.f43119a0;
        if ((str == null || str.isEmpty()) && d0Var.X.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        d3 d3Var = d0Var.container;
        e6Var = ((f3) d0Var).resourcesProvider;
        new vc(d3Var, e6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        d0 d0Var = this.f43113r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = d0Var.X;
        n2 n2Var = d0Var.f30525n;
        d0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            n2Var.presentFragment(bo.R9(-((TLRPC.Chat) tLObject).f18109id));
        } else if (tLObject instanceof TLRPC.User) {
            n2Var.presentFragment(bo.R9(((TLRPC.User) tLObject).f18256id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            n2Var.presentFragment(new bo(bundle));
        }
    }
}
