package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class uv implements Runnable {
    public final int f43351a;
    public final fy f43352b;
    public final long f43353c;
    public final boolean d;

    public uv(fy fyVar, long j10, boolean z10, int i10) {
        this.f43351a = i10;
        this.f43352b = fyVar;
        this.f43353c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f43351a;
        boolean z10 = this.d;
        long j10 = this.f43353c;
        fy fyVar = this.f43352b;
        switch (i10) {
            case 0:
                fy fyVar2 = this.f43352b;
                lh.s6 storiesController = fyVar2.getMessagesController().getStoriesController();
                long j11 = this.f43353c;
                boolean z11 = this.d;
                storiesController.i0(j11, z11, false);
                oc.i iVar = new oc.i(4);
                iVar.f19483b = new uv(fyVar2, j11, z11, 1);
                iVar.f19484c = new uv(fyVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User user = fyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = fyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                if (fyVar2.e4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                fyVar2.O = org.telegram.ui.Components.tc.X().V(Collections.singletonList(chat), replaceTags, null, iVar).j();
                return;
            case 1:
                fyVar.getMessagesController().getStoriesController().i0(j10, !z10, false);
                return;
            default:
                fyVar.getMessagesController().getStoriesController().i0(j10, z10, true);
                return;
        }
    }
}
