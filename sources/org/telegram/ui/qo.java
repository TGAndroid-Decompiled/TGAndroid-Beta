package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qo implements Runnable {
    public final int f36108a;
    public final yo f36109b;

    public qo(yo yoVar, int i10) {
        this.f36108a = i10;
        this.f36109b = yoVar;
    }

    @Override
    public final void run() {
        switch (this.f36108a) {
            case 0:
                yo.V(this.f36109b);
                return;
            case 1:
                yo.a0(this.f36109b);
                return;
            case 2:
                yo yoVar = this.f36109b;
                yoVar.f39041b.dismiss();
                yoVar.finishFragment();
                return;
            case 3:
                yo yoVar2 = this.f36109b;
                yoVar2.M.setChecked(yoVar2.f39070x0.autotranslation);
                return;
            default:
                yo yoVar3 = this.f36109b;
                yoVar3.e.setImageDrawable(yoVar3.f39060r);
                yoVar3.f39042b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = yoVar3.D0;
                if (user != null) {
                    user.photo = null;
                    yoVar3.getMessagesController().putUser(yoVar3.D0, true);
                }
                yoVar3.O0 = true;
                if (yoVar3.R0 == null) {
                    yoVar3.R0 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                yoVar3.f39042b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                yoVar3.f39042b0.e.setAnimation(yoVar3.R0);
                return;
        }
    }
}
