package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

public final class zu extends org.telegram.ui.Components.mx0 {
    public final i6 E;

    public zu(Context context, long j10, i6 i6Var) {
        super(context);
        this.E = i6Var;
        this.f30765a = new RectF();
        this.f30769f = 0.0f;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, true, false);
        this.f30771r = i6Var2;
        org.telegram.ui.Components.i6 i6Var3 = new org.telegram.ui.Components.i6(false, true, false, false);
        this.f30772s = i6Var3;
        i6Var2.setCallback(this);
        i6Var3.setCallback(this);
        this.f30770n = Long.valueOf(j10);
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.f34858p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j10 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            y8Var.g(14);
            imageReceiver.setForUserOrChat(null, y8Var);
        } else {
            String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, y8Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j10));
            this.v = dialogPhotoTitle;
            this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
        }
    }

    @Override
    public final void b() {
        i6 i6Var = this.E;
        z6 z6Var = (z6) i6Var.f38985c;
        z6Var.P.dismiss();
        Bundle bundle = new Bundle();
        long j10 = ((s6) i6Var.f38984b).f42522a;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        z6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
