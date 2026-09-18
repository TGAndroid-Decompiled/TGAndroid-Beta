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
import org.telegram.ui.Components.xc;
import org.telegram.ui.zn;
public final class b0 extends ug.e {
    public final c0 f43350r;

    public b0(c0 c0Var, e6 e6Var) {
        super(e6Var);
        this.f43350r = c0Var;
    }

    @Override
    public final void E() {
        String string;
        e6 e6Var;
        c0 c0Var = this.f43350r;
        String str = c0Var.f43355a0;
        if ((str == null || str.isEmpty()) && c0Var.X.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        d3 d3Var = c0Var.container;
        e6Var = ((f3) c0Var).resourcesProvider;
        new xc(d3Var, e6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        c0 c0Var = this.f43350r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.X;
        n2 n2Var = c0Var.f22943n;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            n2Var.presentFragment(zn.R9(-((TLRPC.Chat) tLObject).f18296id));
        } else if (tLObject instanceof TLRPC.User) {
            n2Var.presentFragment(zn.R9(((TLRPC.User) tLObject).f18443id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            n2Var.presentFragment(new zn(bundle));
        }
    }
}
