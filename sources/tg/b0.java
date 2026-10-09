package tg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.zn;
public final class b0 extends ug.e {
    public final c0 f48296r;

    public b0(c0 c0Var, e6 e6Var) {
        super(e6Var);
        this.f48296r = c0Var;
    }

    @Override
    public final void E() {
        String string;
        c0 c0Var = this.f48296r;
        String str = c0Var.f48301a0;
        if ((str == null || str.isEmpty()) && c0Var.X.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        new ad(c0Var.container, c0.Q(c0Var)).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        c0 c0Var = this.f48296r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.X;
        n2 n2Var = c0Var.f26025n;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            n2Var.presentFragment(zn.W9(-((TLRPC.Chat) tLObject).f20038id));
        } else if (tLObject instanceof TLRPC.User) {
            n2Var.presentFragment(zn.W9(((TLRPC.User) tLObject).f20185id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            n2Var.presentFragment(new zn(bundle));
        }
    }
}
