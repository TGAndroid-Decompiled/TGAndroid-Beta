package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class z90 implements Runnable {
    public final int f43729a;
    public final yn f43730b;
    public final long f43731c;
    public final TLRPC.Chat d;

    public z90(yn ynVar, long j3, TLRPC.Chat chat, int i10) {
        this.f43729a = i10;
        this.f43730b = ynVar;
        this.f43731c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f43729a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f43731c;
        yn ynVar = this.f43730b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.yc.a0(ynVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                org.telegram.ui.Components.yc.a0(ynVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
