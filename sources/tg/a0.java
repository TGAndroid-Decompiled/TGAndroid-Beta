package tg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.zn;
public final class a0 extends ug.e {
    public final b0 f48356r;

    public a0(b0 b0Var, d6 d6Var) {
        super(d6Var);
        this.f48356r = b0Var;
    }

    @Override
    public final void E() {
        String string;
        b0 b0Var = this.f48356r;
        String str = b0Var.f48363a0;
        if ((str == null || str.isEmpty()) && b0Var.X.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        new ad(b0Var.container, b0.Q(b0Var)).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        b0 b0Var = this.f48356r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = b0Var.X;
        m2 m2Var = b0Var.f25523n;
        b0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            m2Var.presentFragment(zn.W9(-((TLRPC.Chat) tLObject).f20032id));
        } else if (tLObject instanceof TLRPC.User) {
            m2Var.presentFragment(zn.W9(((TLRPC.User) tLObject).f20179id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            m2Var.presentFragment(new zn(bundle));
        }
    }
}
