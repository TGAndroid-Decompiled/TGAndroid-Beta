package ug;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.vc;
import org.telegram.ui.sn;
public final class z extends vg.e {
    public final a0 f48265r;

    public z(a0 a0Var, g6 g6Var) {
        super(g6Var);
        this.f48265r = a0Var;
    }

    @Override
    public final void E() {
        String string;
        g6 g6Var;
        a0 a0Var = this.f48265r;
        String str = a0Var.f48090a0;
        if ((str == null || str.isEmpty()) && a0Var.X.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        e3 e3Var = a0Var.container;
        g6Var = ((h3) a0Var).resourcesProvider;
        new vc(e3Var, g6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        a0 a0Var = this.f48265r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = a0Var.X;
        o2 o2Var = a0Var.f33212n;
        a0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            o2Var.presentFragment(sn.W9(-((TLRPC.Chat) tLObject).f20344id));
        } else if (tLObject instanceof TLRPC.User) {
            o2Var.presentFragment(sn.W9(((TLRPC.User) tLObject).f20491id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            o2Var.presentFragment(new sn(bundle));
        }
    }
}
