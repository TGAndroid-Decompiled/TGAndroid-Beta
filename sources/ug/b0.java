package ug;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
public final class b0 extends vg.e {
    public final c0 f46283r;

    public b0(c0 c0Var, c6 c6Var) {
        super(c6Var);
        this.f46283r = c0Var;
    }

    @Override
    public final void E() {
        String string;
        c0 c0Var = this.f46283r;
        String str = c0Var.f46289a0;
        if ((str == null || str.isEmpty()) && c0Var.X.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        new zc(c0Var.container, c0.Q(c0Var)).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        c0 c0Var = this.f46283r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.X;
        m2 m2Var = c0Var.f24345n;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            m2Var.presentFragment(fo.W9(-((TLRPC.Chat) tLObject).f19216id));
        } else if (tLObject instanceof TLRPC.User) {
            m2Var.presentFragment(fo.W9(((TLRPC.User) tLObject).f19363id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            m2Var.presentFragment(new fo(bundle));
        }
    }
}
