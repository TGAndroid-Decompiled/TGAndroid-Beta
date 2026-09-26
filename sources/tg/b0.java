package tg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.wn;
public final class b0 extends ug.e {
    public final c0 f43379r;

    public b0(c0 c0Var, d6 d6Var) {
        super(d6Var);
        this.f43379r = c0Var;
    }

    @Override
    public final void E() {
        String string;
        d6 d6Var;
        c0 c0Var = this.f43379r;
        String str = c0Var.f43384a0;
        if ((str == null || str.isEmpty()) && c0Var.X.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        c3 c3Var = c0Var.container;
        d6Var = ((e3) c0Var).resourcesProvider;
        new xc(c3Var, d6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        c0 c0Var = this.f43379r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.X;
        m2 m2Var = c0Var.f22958n;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            m2Var.presentFragment(wn.R9(-((TLRPC.Chat) tLObject).f18335id));
        } else if (tLObject instanceof TLRPC.User) {
            m2Var.presentFragment(wn.R9(((TLRPC.User) tLObject).f18482id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            m2Var.presentFragment(new wn(bundle));
        }
    }
}
