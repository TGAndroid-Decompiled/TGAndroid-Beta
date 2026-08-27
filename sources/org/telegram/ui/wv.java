package org.telegram.ui;

import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class wv implements Runnable {

    public final int f44198a;

    public final gy f44199b;

    public final long f44200c;
    public final boolean d;

    public wv(gy gyVar, long j10, boolean z10, int i10) {
        this.f44198a = i10;
        this.f44199b = gyVar;
        this.f44200c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        String name;
        TLRPC.User user;
        int i10 = this.f44198a;
        boolean z10 = this.d;
        long j10 = this.f44200c;
        gy gyVar = this.f44199b;
        switch (i10) {
            case 0:
                gy gyVar2 = this.f44199b;
                jh.s6 storiesController = gyVar2.getMessagesController().getStoriesController();
                long j11 = this.f44200c;
                boolean z11 = this.d;
                storiesController.i0(j11, z11, false);
                i6 i6Var = new i6(2);
                i6Var.f38984b = new wv(gyVar2, j11, z11, 1);
                i6Var.f38985c = new wv(gyVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User user2 = gyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    name = ContactsController.formatName(user2.first_name, null, 15);
                    user = user2;
                } else {
                    TLRPC.Chat chat = gyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    name = chat.title;
                    user = chat;
                }
                gyVar2.O = org.telegram.ui.Components.mc.X().V(Collections.singletonList(user), gyVar2.e4() ? AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, name)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(name, null, 15))), null, i6Var).j();
                break;
            case 1:
                gyVar.getMessagesController().getStoriesController().i0(j10, !z10, false);
                break;
            default:
                gyVar.getMessagesController().getStoriesController().i0(j10, z10, true);
                break;
        }
    }
}
