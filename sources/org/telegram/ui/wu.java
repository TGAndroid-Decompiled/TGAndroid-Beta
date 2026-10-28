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
public final class wu extends org.telegram.ui.Components.kz0 {
    public final m4.c I;

    public wu(Context context, long j10, m4.c cVar) {
        super(context);
        this.I = cVar;
        this.f30063a = new RectF();
        this.f30066f = 0.0f;
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.f30068r = r6Var;
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(false, true, false);
        this.f30069s = r6Var2;
        r6Var.setCallback(this);
        r6Var2.setCallback(this);
        this.f30067n = Long.valueOf(j10);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.f29558p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j10 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            j9Var.g(14);
            imageReceiver.setForUserOrChat(null, j9Var);
            return;
        }
        String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, j9Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j10));
        this.v = dialogPhotoTitle;
        this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
    }

    @Override
    public final void b() {
        m4.c cVar = this.I;
        c7 c7Var = (c7) cVar.f18009c;
        c7Var.Z.dismiss();
        Bundle bundle = new Bundle();
        long j10 = ((w6) cVar.f18008b).f44525a;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        c7Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
