package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qo implements Runnable {
    public final int f41374a;
    public final xo f41375b;

    public qo(xo xoVar, int i10) {
        this.f41374a = i10;
        this.f41375b = xoVar;
    }

    @Override
    public final void run() {
        switch (this.f41374a) {
            case 0:
                xo.V(this.f41375b);
                return;
            case 1:
                xo.a0(this.f41375b);
                return;
            case 2:
                xo xoVar = this.f41375b;
                xoVar.f44049b.dismiss();
                xoVar.finishFragment();
                return;
            case 3:
                xo xoVar2 = this.f41375b;
                xoVar2.M.setChecked(xoVar2.f44079x0.autotranslation);
                return;
            default:
                xo xoVar3 = this.f41375b;
                xoVar3.f44054e.setImageDrawable(xoVar3.f44069r);
                xoVar3.f44050b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = xoVar3.D0;
                if (user != null) {
                    user.photo = null;
                    xoVar3.getMessagesController().putUser(xoVar3.D0, true);
                }
                xoVar3.O0 = true;
                if (xoVar3.R0 == null) {
                    xoVar3.R0 = new org.telegram.ui.Components.fk0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                xoVar3.f44050b0.f22483e.setTranslationX(-AndroidUtilities.dp(8.0f));
                xoVar3.f44050b0.f22483e.setAnimation(xoVar3.R0);
                return;
        }
    }
}
