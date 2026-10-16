package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ro implements Runnable {
    public final int f39561a;
    public final zo f39562b;

    public ro(zo zoVar, int i10) {
        this.f39561a = i10;
        this.f39562b = zoVar;
    }

    @Override
    public final void run() {
        switch (this.f39561a) {
            case 0:
                zo.V(this.f39562b);
                return;
            case 1:
                zo.a0(this.f39562b);
                return;
            case 2:
                zo zoVar = this.f39562b;
                zoVar.f42365b.dismiss();
                zoVar.finishFragment();
                return;
            case 3:
                zo zoVar2 = this.f39562b;
                zoVar2.M.setChecked(zoVar2.f42394x0.autotranslation);
                return;
            default:
                zo zoVar3 = this.f39562b;
                zoVar3.e.setImageDrawable(zoVar3.f42384r);
                zoVar3.f42366b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = zoVar3.D0;
                if (user != null) {
                    user.photo = null;
                    zoVar3.getMessagesController().putUser(zoVar3.D0, true);
                }
                zoVar3.O0 = true;
                if (zoVar3.R0 == null) {
                    zoVar3.R0 = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                zoVar3.f42366b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                zoVar3.f42366b0.e.setAnimation(zoVar3.R0);
                return;
        }
    }
}
