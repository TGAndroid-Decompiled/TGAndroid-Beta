package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class tv implements Runnable {
    public final int f43070a;
    public final dy f43071b;
    public final long f43072c;
    public final boolean d;

    public tv(dy dyVar, long j10, boolean z10, int i9) {
        this.f43070a = i9;
        this.f43071b = dyVar;
        this.f43072c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i9 = this.f43070a;
        boolean z10 = this.d;
        long j10 = this.f43072c;
        dy dyVar = this.f43071b;
        switch (i9) {
            case 0:
                dy dyVar2 = this.f43071b;
                ih.v6 storiesController = dyVar2.getMessagesController().getStoriesController();
                long j11 = this.f43072c;
                boolean z11 = this.d;
                storiesController.i0(j11, z11, false);
                org.telegram.ui.Cells.e3 e3Var = new org.telegram.ui.Cells.e3(1);
                e3Var.f24286b = new tv(dyVar2, j11, z11, 1);
                e3Var.f24287c = new tv(dyVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User user = dyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = dyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                if (dyVar2.e4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                dyVar2.O = org.telegram.ui.Components.oc.X().V(Collections.singletonList(chat), replaceTags, null, e3Var).j();
                return;
            case 1:
                dyVar.getMessagesController().getStoriesController().i0(j10, !z10, false);
                return;
            default:
                dyVar.getMessagesController().getStoriesController().i0(j10, z10, true);
                return;
        }
    }
}
