package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class v90 implements Runnable {
    public final int f38653a;
    public final wn f38654b;
    public final long f38655c;
    public final TLRPC.Chat d;

    public v90(wn wnVar, long j3, TLRPC.Chat chat, int i10) {
        this.f38653a = i10;
        this.f38654b = wnVar;
        this.f38655c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f38653a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f38655c;
        wn wnVar = this.f38654b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.yc.a0(wnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                org.telegram.ui.Components.yc.a0(wnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
