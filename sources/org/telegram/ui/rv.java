package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class rv implements Runnable {
    public final int f43300a;
    public final cy f43301b;
    public final long f43302c;
    public final boolean d;

    public rv(cy cyVar, long j10, boolean z10, int i10) {
        this.f43300a = i10;
        this.f43301b = cyVar;
        this.f43302c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f43300a;
        boolean z10 = this.d;
        long j10 = this.f43302c;
        cy cyVar = this.f43301b;
        switch (i10) {
            case 0:
                cy cyVar2 = this.f43301b;
                di.h7 storiesController = cyVar2.getMessagesController().getStoriesController();
                long j11 = this.f43302c;
                boolean z11 = this.d;
                storiesController.i0(j11, z11, false);
                m4.c cVar = new m4.c(9, false);
                cVar.f18009b = new rv(cyVar2, j11, z11, 1);
                cVar.f18010c = new rv(cyVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User user = cyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = cyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                if (cyVar2.m4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                cyVar2.S = org.telegram.ui.Components.wc.Y().W(Collections.singletonList(chat), replaceTags, null, cVar).j();
                return;
            case 1:
                cyVar.getMessagesController().getStoriesController().i0(j10, !z10, false);
                return;
            default:
                cyVar.getMessagesController().getStoriesController().i0(j10, z10, true);
                return;
        }
    }
}
