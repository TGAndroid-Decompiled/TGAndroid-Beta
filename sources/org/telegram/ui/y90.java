package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class y90 implements Runnable {
    public final int f44323a;
    public final zn f44324b;
    public final long f44325c;
    public final TLRPC.Chat d;

    public y90(zn znVar, long j3, TLRPC.Chat chat, int i10) {
        this.f44323a = i10;
        this.f44324b = znVar;
        this.f44325c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f44323a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f44325c;
        zn znVar = this.f44324b;
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
