package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class z90 implements Runnable {
    public final int f44517a;
    public final zn f44518b;
    public final long f44519c;
    public final TLRPC.Chat d;

    public z90(zn znVar, long j3, TLRPC.Chat chat, int i10) {
        this.f44517a = i10;
        this.f44518b = znVar;
        this.f44519c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f44517a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f44519c;
        zn znVar = this.f44518b;
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
