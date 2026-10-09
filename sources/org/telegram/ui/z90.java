package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class z90 implements Runnable {
    public final int f44519a;
    public final zn f44520b;
    public final long f44521c;
    public final TLRPC.Chat d;

    public z90(zn znVar, long j3, TLRPC.Chat chat, int i10) {
        this.f44519a = i10;
        this.f44520b = znVar;
        this.f44521c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f44519a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f44521c;
        zn znVar = this.f44520b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.ad.a0(znVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                org.telegram.ui.Components.ad.a0(znVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
