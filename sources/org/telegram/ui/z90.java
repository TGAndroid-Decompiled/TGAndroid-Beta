package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class z90 implements Runnable {
    public final int f39238a;
    public final eo f39239b;
    public final long f39240c;
    public final TLRPC.Chat d;

    public z90(eo eoVar, long j3, TLRPC.Chat chat, int i10) {
        this.f39238a = i10;
        this.f39239b = eoVar;
        this.f39240c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f39238a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f39240c;
        eo eoVar = this.f39239b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.wc.a0(eoVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                org.telegram.ui.Components.wc.a0(eoVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
