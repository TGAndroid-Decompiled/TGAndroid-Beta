package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class tv implements Runnable {
    public final int f42083a;
    public final ey f42084b;
    public final long f42085c;
    public final boolean d;

    public tv(ey eyVar, long j10, boolean z10, int i10) {
        this.f42083a = i10;
        this.f42084b = eyVar;
        this.f42085c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f42083a;
        boolean z10 = this.d;
        long j10 = this.f42085c;
        ey eyVar = this.f42084b;
        switch (i10) {
            case 0:
                ey eyVar2 = this.f42084b;
                ci.h7 storiesController = eyVar2.getMessagesController().getStoriesController();
                long j11 = this.f42085c;
                boolean z11 = this.d;
                storiesController.i0(j11, z11, false);
                mi.q qVar = new mi.q(9, (byte) 0);
                qVar.f17036b = new tv(eyVar2, j11, z11, 1);
                qVar.f17037c = new tv(eyVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User user = eyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = eyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                if (eyVar2.c4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                eyVar2.S = org.telegram.ui.Components.xc.X().V(Collections.singletonList(chat), replaceTags, null, qVar).j();
                return;
            case 1:
                eyVar.getMessagesController().getStoriesController().i0(j10, !z10, false);
                return;
            default:
                eyVar.getMessagesController().getStoriesController().i0(j10, z10, true);
                return;
        }
    }
}
