package sg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.wc;
import org.telegram.ui.eo;
public final class b0 extends tg.e {
    public final c0 f41875r;

    public b0(c0 c0Var, f6 f6Var) {
        super(f6Var);
        this.f41875r = c0Var;
    }

    @Override
    public final void E() {
        String string;
        f6 f6Var;
        c0 c0Var = this.f41875r;
        String str = c0Var.f41878a0;
        if ((str == null || str.isEmpty()) && c0Var.X.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        f3 f3Var = c0Var.container;
        f6Var = ((h3) c0Var).resourcesProvider;
        new wc(f3Var, f6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        c0 c0Var = this.f41875r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.X;
        p2 p2Var = c0Var.f21452n;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            p2Var.presentFragment(eo.R9(-((TLRPC.Chat) tLObject).f17195id));
        } else if (tLObject instanceof TLRPC.User) {
            p2Var.presentFragment(eo.R9(((TLRPC.User) tLObject).f17342id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            p2Var.presentFragment(new eo(bundle));
        }
    }
}
