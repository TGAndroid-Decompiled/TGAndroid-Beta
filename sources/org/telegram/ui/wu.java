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
public final class wu extends org.telegram.ui.Components.vy0 {
    public final n2.e I;

    public wu(Context context, long j10, n2.e eVar) {
        super(context);
        this.I = eVar;
        this.f31927a = new RectF();
        this.f31930f = 0.0f;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true);
        this.f31932r = p6Var;
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(false, true, false);
        this.f31933s = p6Var2;
        p6Var.setCallback(this);
        p6Var2.setCallback(this);
        this.f31931n = Long.valueOf(j10);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.f26822p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j10 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            h9Var.g(14);
            imageReceiver.setForUserOrChat(null, h9Var);
            return;
        }
        String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, h9Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j10));
        this.v = dialogPhotoTitle;
        this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
    }

    @Override
    public final void b() {
        n2.e eVar = this.I;
        c7 c7Var = (c7) eVar.f17036c;
        c7Var.T.dismiss();
        Bundle bundle = new Bundle();
        long j10 = ((v6) eVar.f17035b).f42133a;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        c7Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
