package ug;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.qn;
public final class a0 extends vg.e {
    public final b0 f47647r;

    public a0(b0 b0Var, d6 d6Var) {
        super(d6Var);
        this.f47647r = b0Var;
    }

    @Override
    public final void E() {
        String string;
        b0 b0Var = this.f47647r;
        String str = b0Var.f47653a0;
        if ((str == null || str.isEmpty()) && b0Var.X.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        new xc(b0Var.container, b0.Q(b0Var)).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        b0 b0Var = this.f47647r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = b0Var.X;
        n2 n2Var = b0Var.f24882n;
        b0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            n2Var.presentFragment(qn.W9(-((TLRPC.Chat) tLObject).f20276id));
        } else if (tLObject instanceof TLRPC.User) {
            n2Var.presentFragment(qn.W9(((TLRPC.User) tLObject).f20423id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            n2Var.presentFragment(new qn(bundle));
        }
    }
}
