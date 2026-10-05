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
import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;
public final class b0 extends ug.e {
    public final c0 f46995r;

    public b0(c0 c0Var, d6 d6Var) {
        super(d6Var);
        this.f46995r = c0Var;
    }

    @Override
    public final void E() {
        String string;
        d6 d6Var;
        c0 c0Var = this.f46995r;
        String str = c0Var.f47000a0;
        if ((str == null || str.isEmpty()) && c0Var.X.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        d3 d3Var = c0Var.container;
        d6Var = ((f3) c0Var).resourcesProvider;
        new yc(d3Var, d6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        c0 c0Var = this.f46995r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.X;
        n2 n2Var = c0Var.f25357n;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            n2Var.presentFragment(yn.Q9(-((TLRPC.Chat) tLObject).f20047id));
        } else if (tLObject instanceof TLRPC.User) {
            n2Var.presentFragment(yn.Q9(((TLRPC.User) tLObject).f20194id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            n2Var.presentFragment(new yn(bundle));
        }
    }
}
